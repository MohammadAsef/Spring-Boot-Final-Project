package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import hu.cs.se.adjva.projectmanagement.Repository.UserRepository;
import hu.cs.se.adjva.projectmanagement.Util.JwtUtility;
import hu.cs.se.adjva.projectmanagement.model.JwtRequest;
import hu.cs.se.adjva.projectmanagement.model.JwtResponse;
import hu.cs.se.adjva.projectmanagement.model.User;
import hu.cs.se.adjva.projectmanagement.service.UserDetailsServiceImpl;


@RestController
public class SecurityController {


    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/authenticate")
    public JwtResponse Authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
        
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),
            jwtRequest.getPassword()));  
        } catch (BadCredentialsException e) {
            throw new Exception("bad credentials Exceptions");
        }
        
    
         UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
         String jwtToken = jwtUtility.generateToken(userDetails);
         User user = userRepository.findByUsername(jwtRequest.getUsername());
         
         return  new JwtResponse(user.getFirstname()+" "+ user.getLastname(), user.getUsername(), jwtToken); 
            
        }

     
    @PostMapping("/api/register")
        public JwtResponse register(@RequestBody User user){
            
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userRepository.save(user);

            UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

            String jwtToken = jwtUtility.generateToken(userDetails);

            return new JwtResponse(user.getFirstname() + " " + user.getLastname(), user.getUsername(), jwtToken);

        }




    
}
