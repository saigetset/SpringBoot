package com.sai.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sai.Courses.ICourse;

@Component(value="stud")
//@PropertySource(value = { "src/main/resources/application.properties" })
public class Student {
	@Value("${com.stu.id}")
	private int id;
	@Value("${com.stu.name}")
	private String name;
	@Value("${com.stu.age}")
	private int age;
	@Value("${com.stu.school}")
	private String school;
	
	@Autowired(required=true)
	@Qualifier("python")
	private ICourse course;
	
	static {
		System.out.println("Student.class file loaded");
	}
	public Student() {
		System.out.println("Student constructor is created");
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", school=" + school + ", course=" + course
				+ "]";
	}
	
}
