package com.oscavian.springbootemup.controller;

import com.oscavian.springbootemup.model.User;
import com.oscavian.springbootemup.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
class UserController {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getById(@PathVariable String id) {
        var user = userService.findById(UUID.fromString(id));
        return user.orElse(null);
    }

}
