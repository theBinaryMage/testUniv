package com.example.university.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	//fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="dept_name")
	private String deptName;
	
	@Column(name="HOD")
	private String HOD;
	
	@OneToMany(mappedBy="department", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH,CascadeType.REFRESH})
	private List<Student> students;
	
	public void add(Student tempStudent)
	{
		if(students==null)
			students= new ArrayList<>();
		
		students.add(tempStudent);
		tempStudent.setBranch(deptName);
	}
		
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	//constructor
	public Department(String deptName, String hOD) {
		
		this.deptName = deptName;
		HOD = hOD;
	}

	public Department() {
	
		// TODO Auto-generated constructor stub
	}

	//getters& setters	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getHOD() {
		return HOD;
	}

	public void setHOD(String hOD) {
		HOD = hOD;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", HOD=" + HOD + "]";
	}
	
	

	

}
