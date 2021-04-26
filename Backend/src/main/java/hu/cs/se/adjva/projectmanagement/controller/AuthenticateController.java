package hu.cs.se.adjva.projectmanagement.controller;

import hu.cs.se.adjva.projectmanagement.Repository.UserRepository;
import hu.cs.se.adjva.projectmanagement.model.Customer;
import hu.cs.se.adjva.projectmanagement.model.JWTAuthication;
import hu.cs.se.adjva.projectmanagement.model.JwtResponse;
import hu.cs.se.adjva.projectmanagement.model.User;
import hu.cs.se.adjva.projectmanagement.service.CustomerServices;
import hu.cs.se.adjva.projectmanagement.service.UserDetailServiceImp;
import hu.cs.se.adjva.projectmanagement.util.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  hu.cs.se.adjva.projectmanagement.service.UserDetailServiceImp;

@RestController

@CrossOrigin(origins = "*")
public class AuthenticateController {


    @Autowired
    UserDetailServiceImp UserDetailServiceImp;


    @Autowired
    JwtUtility jwtUtility;

    @Autowired
    UserRepository userRepository;


    @Autowired
    private CustomerServices customerServices;

    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("/authenticate")
    public ResponseEntity<JwtResponse> autheication(@RequestBody JWTAuthication jwtauth) throws Exception{

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtauth.getUsername(),jwtauth.getPassword()));
        }catch (BadCredentialsException e){
            throw new BadCredentialsException("error");
        }

        UserDetails userDetails =UserDetailServiceImp.loadUserByUsername(jwtauth.getUsername());


        String jwtToken =  jwtUtility.generateToken(userDetails);
        User user = userRepository.findByUsername(jwtauth.getUsername());

        return new ResponseEntity(new JwtResponse(user.getUsername(),user.getAddress(),user.getPhone(),jwtToken), HttpStatus.OK);

    }




}
