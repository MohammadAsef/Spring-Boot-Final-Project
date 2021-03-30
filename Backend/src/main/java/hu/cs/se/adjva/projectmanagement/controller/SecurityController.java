package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.JwtRequest;

@RestController
public class SecurityController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public String Authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
        
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),
            jwtRequest.getPassword()));  
        } catch (BadCredentialsException e) {
            throw new Exception("bad credentials Exceptions");
        }
        
    
    return null;    }
    
}
