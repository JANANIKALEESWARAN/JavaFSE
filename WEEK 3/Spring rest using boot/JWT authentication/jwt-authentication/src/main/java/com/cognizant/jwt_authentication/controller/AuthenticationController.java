package com.cognizant.jwt_authentication.controller;



import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_authentication.model.AuthenticationResponse;
import com.cognizant.jwt_authentication.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        // Remove "Basic "
        String base64Credentials = authorizationHeader.substring(6);

        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // For this exercise, just validate fixed credentials
        if ("user".equals(username) && "pwd".equals(password)) {

            String token = JwtUtil.generateToken(username);

            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}
