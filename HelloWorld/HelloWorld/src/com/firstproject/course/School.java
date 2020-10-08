package com.firstproject.course;

import java.util.ArrayList;
import java.util.HashSet;

import com.firstproject.helloworld.Student;

public class School {
	
	public String schoolName;
	public ArrayList<Course> classes;
	public HashSet<Student> allStudents;
	public String principal;
	
	public School() {}
	
	public School(String name) {
		this.schoolName = name;
		this.principal = "";
		this.classes = new ArrayList<Course>();
		this.allStudents = new HashSet<>();
	}
	
	public School(String name, Course course, String principal) {
		this.schoolName = name;
		this.principal = principal;
		this.classes.add(course);
		this.allStudents = new HashSet<>();
		for(int i= 0; i < course.enrolled.size(); i++) {
			this.allStudents.add(course.enrolled.get(i));
		}
		
		
	}
	
	public School(String name, String principal) {
		this.schoolName = name;
		this.principal = principal;
		this.classes = new ArrayList<Course>();
		this.allStudents = new HashSet<>();
		
	}
	
	public void addCourse (Course course) {
		this.classes.add(course);
		for(int i= 0; i < course.enrolled.size(); i++) {
			this.allStudents.add(course.enrolled.get(i));
		}
	}
	
	public void addPrincipal (String principal) {
		this.principal = principal;
	}
	
	@Override
	public String toString() {
		return this.schoolName + " has the following classes: " + classes;
	}

}
