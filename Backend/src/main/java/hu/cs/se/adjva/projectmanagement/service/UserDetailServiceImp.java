package hu.cs.se.adjva.projectmanagement.service;

import hu.cs.se.adjva.projectmanagement.Repository.UserRepository;
import hu.cs.se.adjva.projectmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;

@Service
public class UserDetailServiceImp implements UserDetailsService {


    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user =  userRepository.findByUsername(s);
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),new ArrayDeque<>());
    }
}
