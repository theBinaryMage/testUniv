package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {

}
