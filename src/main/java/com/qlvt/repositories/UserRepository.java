package com.qlvt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.qlvt.domain.Entities.User;
import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findById(Long id);
  
}


