package com.example.onlineexamsystem.service;

import com.example.onlineexamsystem.model.Result;
import com.example.onlineexamsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getResultsByUserId(Long userId) {
        // This should be customized based on actual requirements
        return resultRepository.findAll(); // Placeholder
    }
}
