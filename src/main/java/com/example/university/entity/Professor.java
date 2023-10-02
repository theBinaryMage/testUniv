package com.example.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	//fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="prof_name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	
	
	//constructor
	
	public Professor(String name, String department) {
		
		this.name = name;
		this.department = department;
	}
	
	
	
	public Professor() {
		
		// TODO Auto-generated constructor stub
	}



	//getter& setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	//toString
	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
