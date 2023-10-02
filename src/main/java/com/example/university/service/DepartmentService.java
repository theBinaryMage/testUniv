package com.example.university.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.university.entity.Department;
import com.example.university.entity.Student;
import com.example.university.repository.DepartmentRepository;

import jakarta.persistence.Cacheable;
import jakarta.transaction.Transactional;

@Service

public class DepartmentService implements DeptServiceInterface{

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	@Override
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		return departmentRepository.save(dept);
	}
	
	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable Integer id) {
		Optional<Department> departmentOptional = departmentRepository.findById(id);
		return departmentOptional.orElse(null);
	}
	
	@Cacheable("studentsByDepartment")
    public List<Student> getStudentsByDepartmentId(Integer departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);

        if (department != null) {
            return department.getStudents().stream()
                    .map(student -> {
                        Student stud = new Student();
                        stud.setId(student.getId());
                        stud.setFirstName(student.getFirstName());
                        stud.setLastName(student.getLastName());
                        // Set other properties as needed
                        return stud;
                    })
                    .collect(Collectors.toList());
        }

        return null;
    }

	

}
