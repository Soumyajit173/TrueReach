package com.guvi.projects.TrueReach.controller;

import com.guvi.projects.TrueReach.model.User;
import com.guvi.projects.TrueReach.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    // Get all users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(
                userService.getAllUsers()
        );
    }

    @PostMapping
    public ResponseEntity<?> createAdminUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createAdminUser(user), HttpStatus.CREATED);
    }
}