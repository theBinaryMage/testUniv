package com.example.university.service;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.university.entity.Student;
import com.example.university.entity.Department;
public interface DeptServiceInterface {
	
	public Department saveDepartment(Department dept);
	public List<Student> getStudentsByDepartmentId(Integer departmentId);
	public Department getDepartmentById(Integer id);
	public List<Department> getAllDepartments()

}
