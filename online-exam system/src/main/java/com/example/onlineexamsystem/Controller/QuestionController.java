package com.example.onlineexamsystem.controller;

import com.example.onlineexamsystem.model.Question;
import com.example.onlineexamsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions")
    public String getQuestions(Model model) {
        model.addAttribute("questions", questionService.getAllQuestions());
        return "questions";
    }

    @GetMapping("/create_question")
    public String createQuestionForm(Model model) {
        model.addAttribute("question", new Question());
        return "create_question";
    }

    @PostMapping("/create_question")
    public String saveQuestion(@ModelAttribute Question question) {
        questionService.saveQuestion(question);
        return "redirect:/questions";
    }

    @GetMapping("/delete_question/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return "redirect:/questions";
    }
}
