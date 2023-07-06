package com.sai.Employee;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.sai.Student.Student;


@Component(value = "emp")
@ConfigurationProperties(prefix = "com.emp")
public class Employee {
	private int id;
	private String name;
	private int age;
	private String company;
	
	@Autowired(required=true)
	private Student std;
	
	@Autowired(required=true)
	private LocalDateTime doj;
	
	static {
		System.out.println("Employee.class file loaded");
	}
	public Employee() {
		System.out.println("Employee constructor is created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Employee.setAge()");
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("Employee.setCompany()");
		this.company = company;
	}
	

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	public LocalDateTime getDoj() {
		return doj;
	}

	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + ", std=" + std
				+ ", doj=" + doj + "]";
	}
	
	
	
}
