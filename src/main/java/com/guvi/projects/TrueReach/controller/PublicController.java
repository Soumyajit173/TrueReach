package com.guvi.projects.TrueReach.controller;

import com.guvi.projects.TrueReach.model.User;
import com.guvi.projects.TrueReach.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/public")
public class PublicController {

    private final UserService userService;

    public PublicController(UserService userService) {
        this.userService = userService;
    }

    // Health Check
    @GetMapping("/health")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("OK");
    }

    // Register User
    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        boolean created = userService.createUser(user);

        if (created) {
            return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("User could not be created", HttpStatus.BAD_REQUEST);
        }
    }
}