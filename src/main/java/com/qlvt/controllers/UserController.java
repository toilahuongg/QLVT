package com.qlvt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qlvt.domain.Entities.User;
import com.qlvt.repositories.UserRepository;
import com.qlvt.response.NotFoundException;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  UserRepository repository;


  @GetMapping("/users/{id}")
  public ResponseEntity<User> getUserById(@PathVariable String id) {
    Optional<User> userFound = repository.findById(Long.parseLong(id));
    if (userFound.isPresent()) {
      return new ResponseEntity<User>(userFound.get(), HttpStatus.OK);
    } else {
      throw new NotFoundException("User not found with ID: " + id);
    }
  }
}
