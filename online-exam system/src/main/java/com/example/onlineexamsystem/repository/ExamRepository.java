package com.example.onlineexamsystem.repository;

import com.example.onlineexamsystem.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
