package com.example.university.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.university.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
