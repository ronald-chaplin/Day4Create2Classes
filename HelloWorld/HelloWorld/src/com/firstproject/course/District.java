package com.firstproject.course;

import java.util.ArrayList;
import java.util.HashSet;

import com.firstproject.helloworld.Student;

public class District {
	
	public String districtName;
	public HashSet<Student> districtStudents;
	public ArrayList<School> schools;
	public String superintendent;
	
	public District() {}
	
	public District(String districtName, String superintendent) {
		this.districtName = districtName;
		this.superintendent = superintendent;
		this.districtStudents = new HashSet<Student>();
		this.schools = new ArrayList<School>();
	}
	
	public District(String districtName, String superintendent, School school) {
		this.districtName = districtName;
		this.superintendent = superintendent;
		this.districtStudents = new HashSet<Student>();
		this.schools = new ArrayList<School>();
		this.schools.add(school);
		for (Student i : school.allStudents) {
			this.districtStudents.add(i);
		}		
	}
	
	public void addSchool(School school) {
		this.schools.add(school);
		for (Student i : school.allStudents) {
			this.districtStudents.add(i);
		}	
	}
	
	@Override
	public String toString() {
		return this.districtName + " run by " + this.superintendent + " has " + this.schools.size() + " school(s) with " + this.districtStudents.size() + " students.";
	}
	
	
}
