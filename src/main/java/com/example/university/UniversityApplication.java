package com.example.university;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.university.entity.Department;
import com.example.university.entity.Student;
import com.example.university.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@EnableCaching
public class UniversityApplication implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepository deptRepository;
	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}
	@Override
	public void run(String[] args )throws Exception {
		
		Department dept= new Department();
		dept.setId(7);
		dept.setDeptName("Architecture");
		dept.setHOD("Vibhor Das");
		
		Student student = new Student();
		student.setId(10);
		student.setFirstName("Kapil");
		student.setLastName("Kumar");
		student.setBranch("Architecture");
		student.setDepartment(dept);
		
		Student student2 = new Student();
		student2.setId(11);
		student2.setFirstName("Kaushal");
		student2.setLastName("Kumar");
		student2.setBranch("Architecture");
		student2.setDepartment(dept);
		
		List<Student> studList = new ArrayList<>();
		studList.add(student);
		studList.add(student2);
		
		dept.setStudents(studList);
		
		deptRepository.save(dept);
		
	}
	
}
