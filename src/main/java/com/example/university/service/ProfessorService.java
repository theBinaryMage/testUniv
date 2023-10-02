package com.example.university.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.Professor;
import com.example.university.entity.Student;
import com.example.university.repository.ProfessorRepository;

import jakarta.transaction.Transactional;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	@Autowired
	public ProfessorService(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}

	public List<Professor> getAllProfessors() {
		return professorRepository.findAll();
	}

	public Professor getProfessorById(Integer id) {
		Optional<Professor> professorOptional = professorRepository.findById(id);
		return professorOptional.orElse(null);
	}

}
