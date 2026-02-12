package tn.esprit.user;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

    // 1. Create a secure key for signing the token
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // 2. Generate a token for a specific username
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // Expire in 24 hours
                .signWith(key)
                .compact();
    }
}