package com.example.keycloakdemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.security.authorization.AuthorityAuthorizationManager.hasRole;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello(){
        return "Hello from Springboot & Keycloak";
    }
    @GetMapping("/hello2")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2(){
        return "Hello from Springboot Keycloak - Dear ADMIN";
    }
}
