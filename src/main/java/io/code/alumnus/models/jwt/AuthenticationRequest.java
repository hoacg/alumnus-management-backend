package io.code.alumnus.models.jwt;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}
