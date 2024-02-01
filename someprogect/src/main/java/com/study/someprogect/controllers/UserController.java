package com.study.someprogect.controllers;

import com.study.someprogect.DTO.UserDTO;
import com.study.someprogect.entity.User;
import com.study.someprogect.servises.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService service;


    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") String id) {
        return service.getUser(id);
    }

    @PostMapping(value = "/add")
    public User addUser(@RequestBody UserDTO newUser) {
        return service.getUser(service.addUser(newUser).toString());
    }

    @DeleteMapping(value = "/{id}/delete")
    public void deleteUser(@PathVariable("id") String id) {
        service.deleteUser(id);
    }

}
