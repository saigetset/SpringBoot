package com.sai.Courses;

import org.springframework.stereotype.Component;

@Component(value="python")
public class PythonCourse implements ICourse {

	@Override
	public String courseName() {
		return "Python";
	}

	@Override
	public int courseId() {
		return 456;
	}

	@Override
	public String toString() {
		return "PythonCourse [courseName()=" + courseName() + ", courseId()=" + courseId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
