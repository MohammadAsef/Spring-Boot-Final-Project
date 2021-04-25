package hu.cs.se.adjva.projectmanagement.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import hu.cs.se.adjva.projectmanagement.Util.JwtUtility;
import hu.cs.se.adjva.projectmanagement.service.UserDetailsServiceImpl;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

            String authenticationHeader = request.getHeader("Authorization");

            String jwtToken = null;
            String username = null;
            if(authenticationHeader != null && authenticationHeader.startsWith("Bearer ")){
                  jwtToken = authenticationHeader.substring(7);
                   username = jwtUtility.getUsernameFromToken(jwtToken);
                  
            }

           System.out.println(jwtToken);

            if(username != null){
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);

                if(jwtUtility.validateToken(jwtToken, userDetails)){

                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(userDetails.getUsername(), 
                    userDetails.getPassword(), userDetails.getAuthorities());

                    usernamePasswordAuthenticationToken.setDetails(request);

                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

                }
            }

            filterChain.doFilter(request, response);
      }
    
}
