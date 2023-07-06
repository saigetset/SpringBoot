package com.sai.Courses;

import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements ICourse {

	@Override
	public String courseName() {
		return "Java";
	}

	@Override
	public int courseId() {
		return 123;
	}

	@Override
	public String toString() {
		return "JavaCourse [courseName()=" + courseName() + ", courseId()=" + courseId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
