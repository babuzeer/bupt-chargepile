package com.example.charge.repository;

import com.example.charge.model.Pile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PileRepository extends JpaRepository<Pile, String> {
}

