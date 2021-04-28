package hu.cs.se.adjva.projectmanagement.filter;

import hu.cs.se.adjva.projectmanagement.service.UserDetailServiceImp;
import hu.cs.se.adjva.projectmanagement.util.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    JwtUtility jwtUtility;

    @Autowired
    UserDetailServiceImp userDetailServiceImp;
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {


        String token = null;
        String username = null;

        String authicationHeader = httpServletRequest.getHeader("Authorization");

        if (authicationHeader != null && authicationHeader.startsWith("Bearer ")){

            token = authicationHeader.substring(7);
            username = jwtUtility.getUsernameFromToken(token);


        }

        if (username != null){

           UserDetails userDetails =  userDetailServiceImp.loadUserByUsername(username);

           if (jwtUtility.validateToken(token,userDetails)){

               UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());

               usernamePasswordAuthenticationToken.setDetails(httpServletRequest);

               SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
           }

        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);

    }
}
