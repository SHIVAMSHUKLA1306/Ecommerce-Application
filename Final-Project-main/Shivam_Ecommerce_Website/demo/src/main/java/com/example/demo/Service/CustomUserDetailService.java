package com.example.demo.Service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CustomUserDetail;
import com.example.demo.Model.User;
import com.example.demo.Respository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
        Optional<User> user=UserRepository.findUserByEmail(username);
        user.orElseThrow(()-> new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get();
    }
    
}
