package com.garibyan.springbootdemo.repository;

import com.garibyan.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
