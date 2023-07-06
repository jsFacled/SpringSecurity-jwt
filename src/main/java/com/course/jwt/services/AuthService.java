package com.course.jwt.services;


import com.course.jwt.dto.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public JwtResponse login(String clientId, String clientSecret){
        JwtResponse jwt = JwtResponse.builder().build();
        return jwt;
    }
}
