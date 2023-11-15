package com.qlvt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.qlvt.domain.Entities.TaiKhoan;

import java.util.Optional;


public interface TaiKhoanRepository extends CrudRepository<TaiKhoan, Long> {
  Optional<TaiKhoan> findById(Long id);
}


