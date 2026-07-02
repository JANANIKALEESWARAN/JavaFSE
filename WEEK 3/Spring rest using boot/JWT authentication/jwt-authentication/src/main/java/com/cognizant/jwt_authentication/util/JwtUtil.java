package com.cognizant.jwt_authentication.util;


import java.nio.charset.StandardCharsets;

import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Jwts;

public class JwtUtil {

    private static final String SECRET =
            "MySecretKeyForJWTGeneration123456";

    private static final SecretKey KEY =
            new SecretKeySpec(
                    SECRET.getBytes(StandardCharsets.UTF_8),
                    "HmacSHA256");

    public static String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(KEY)
                .compact();
    }
}