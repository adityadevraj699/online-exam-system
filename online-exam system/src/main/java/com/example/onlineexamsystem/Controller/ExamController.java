package com.example.onlineexamsystem.controller;

import com.example.onlineexamsystem.model.Exam;
import com.example.onlineexamsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExamController {
    @Autowired
    private ExamService examService;

    @GetMapping("/exams")
    public String getExams(Model model) {
        model.addAttribute("exams", examService.getAllExams());
        return "exams";
    }

    @GetMapping("/create_exam")
    public String createExamForm(Model model) {
        model.addAttribute("exam", new Exam());
        return "create_exam";
    }

    @PostMapping("/create_exam")
    public String saveExam(@ModelAttribute Exam exam) {
        examService.saveExam(exam);
        return "redirect:/exams";
    }

    @GetMapping("/delete_exam/{id}")
    public String deleteExam(@PathVariable Long id) {
        examService.deleteExam(id);
        return "redirect:/exams";
    }
}
