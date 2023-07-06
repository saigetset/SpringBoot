package com.sai.Student;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component(value="stud")
@ConfigurationProperties(prefix = "com.stu")
public class Student {
	private int id;
	private String name;
	private int age;
	private String school;
	
	
	static {
		System.out.println("Student.class file loaded");
	}
	public Student() {
		System.out.println("Student constructor is created");
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
}
