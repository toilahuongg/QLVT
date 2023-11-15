package com.qlvt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qlvt.domain.Entities.TaiKhoan;
import com.qlvt.repositories.TaiKhoanRepository;
import com.qlvt.response.NotFoundException;

@RestController
@RequestMapping("/api")
public class TaiKhoanController {

  @Autowired
  TaiKhoanRepository repository;

  // private static final Logger logger = LoggerFactory.getLogger(TaiKhoanController.class);

  @GetMapping("/tai-khoan/{id}")
  public ResponseEntity<TaiKhoan> getTaiKhoanById(@PathVariable String id) {
    Optional<TaiKhoan> taiKhoanFound = repository.findById(Long.parseLong(id));
    if (taiKhoanFound.isPresent()) {
      return new ResponseEntity<>(taiKhoanFound.get(), HttpStatus.OK);
    } else {
      throw new NotFoundException("TaiKhoan not found with ID: " + id);
    }
  }
}
