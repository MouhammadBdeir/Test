package dev.danvega.blog.controller;

import dev.danvega.blog.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final AuthenticationService authenticationService;

    @Autowired
    public UserController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationRequest request) {
        boolean isRegistered = authenticationService.registerUser(request.getUsername(), request.getPassword());
        if (isRegistered) {
            return "User registered successfully";
        } else {
            return "Username already exists";
        }
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest request) {
        boolean isAuthenticated = authenticationService.authenticateUser(request.getUsername(), request.getPassword());
        if (isAuthenticated) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody RegistrationRequest request) {
        boolean isCreated = authenticationService.registerUser(request.getUsername(), request.getPassword());
        if (isCreated) {
            return ResponseEntity.ok("User created successfully");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Username already exists");
        }
    }
}
