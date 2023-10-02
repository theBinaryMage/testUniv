package com.example.university.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.Student;
import com.example.university.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student getStudentById(Integer id) {
		Optional<Student> studentOptional = studentRepository.findById(id);
		return studentOptional.orElse(null);
	}

	@Transactional
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public boolean deleteStudentById(Integer id) {
		Optional<Student> studentOptional = studentRepository.findById(id);
		if (studentOptional.isEmpty()) {
			return false; // Or throw a custom exception
		}

		// Delete the student
		studentRepository.delete(studentOptional.get());
		return true;
	}

}
