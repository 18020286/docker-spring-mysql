package com.example.springbootdocker.repository;

import com.example.springbootdocker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
