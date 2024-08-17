package com.example.onlineexamsystem.repository;

import com.example.onlineexamsystem.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
