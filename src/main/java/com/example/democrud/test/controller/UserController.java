package com.example.democrud.test.controller;// src/main/java/com/example/demo/controller/UserController.java

import com.example.democrud.test.entity.Student;
import com.example.democrud.test.exception.UserNotFoundException;
import com.example.democrud.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/student")
    Student newUser(@RequestBody Student newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/students")
    List<Student> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/student/{id}")
    Student getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/student/{id}")
    Student updateUser(@RequestBody Student newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/student/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return  "Student with id "+id+" has been deleted success.";
    }



}