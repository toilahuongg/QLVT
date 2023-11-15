package com.qlvt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qlvt.domain.Entities.ChiNhanh;
import com.qlvt.repositories.ChiNhanhRepository;
import com.qlvt.response.NotFoundException;

@RestController
@RequestMapping("/api")
public class ChiNhanhController {

  @Autowired
  ChiNhanhRepository repository;

  // private static final Logger logger = LoggerFactory.getLogger(ChiNhanhController.class);

  @GetMapping("/chi-nhanh/{id}")
  public ResponseEntity<ChiNhanh> getChiNhanhById(@PathVariable String id) {
    Optional<ChiNhanh> chiNhanhFound = repository.findById(Long.parseLong(id));
    if (chiNhanhFound.isPresent()) {
      return new ResponseEntity<>(chiNhanhFound.get(), HttpStatus.OK);
    } else {
      throw new NotFoundException("ChiNhanh not found with ID: " + id);
    }
  }
}
