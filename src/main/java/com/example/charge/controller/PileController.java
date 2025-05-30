package com.example.charge.controller;

import com.example.charge.model.Pile;
import com.example.charge.repository.PileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class PileController {

    @Autowired
    private PileRepository repository;

    @GetMapping("/status")
    public List<Pile> getAllStatus() {
        return repository.findAll();
    }
}
