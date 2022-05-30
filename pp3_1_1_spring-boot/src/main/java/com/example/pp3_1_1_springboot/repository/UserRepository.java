package com.example.pp3_1_1_springboot.repository;

import com.example.pp3_1_1_springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
