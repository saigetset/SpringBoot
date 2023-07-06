package com.sai.Courses;

import org.springframework.stereotype.Component;

@Component(value="CPP")
public class CppCourse implements ICourse {

	@Override
	public String toString() {
		return "CppCourse [courseName()=" + courseName() + ", courseId()=" + courseId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String courseName() {
		return "CPP";
	}

	@Override
	public int courseId() {
		return 789;
	}

}
