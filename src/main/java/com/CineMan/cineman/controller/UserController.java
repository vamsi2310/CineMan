package com.CineMan.cineman.controller;

import com.CineMan.cineman.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private com.CineMan.cineman.repository.UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        user.setEmail("email1@emailcom");
        user.setPassword("password");
        return userRepository.save(user);
    }

    // @PutMapping("/{id}")
    // public User updateBook(@PathVariable String id, @RequestBody User book) {
    //     User.setId(id);
    //     return userRepository.save(book);
    // }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
