package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/profile")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<UserDTO> findByProfile() {
        UserDTO entity = service.findByProfile();
        return ResponseEntity.ok().body(entity);
    }
}
