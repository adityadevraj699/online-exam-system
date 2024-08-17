package com.example.onlineexamsystem.repository;

import com.example.onlineexamsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
