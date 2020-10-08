package com.firstproject.course;

import java.util.ArrayList;

import com.firstproject.helloworld.Student;

public class Course {
	public String title;
	public ArrayList<Student> enrolled;
	
	public Course() {}
	
	public Course(String title) {
		this.title = title;
		this.enrolled = new ArrayList<>();
	}
	
	public void enrollStudent(Student student) {
		this.enrolled.add(student);
	}
	
	@Override
	public String toString() {
		return this.title + " " + this.enrolled;
	}
}
