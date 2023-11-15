package com.qlvt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.qlvt.domain.Entities.ChiNhanh;
import java.util.Optional;


public interface ChiNhanhRepository extends CrudRepository<ChiNhanh, Long> {
  Optional<ChiNhanh> findById(Long id);
  
}


