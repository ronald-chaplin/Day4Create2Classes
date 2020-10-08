package com.firstproject.helloworld;

import com.firstproject.course.Course;
import com.firstproject.course.School;
import com.firstproject.course.District;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ronald = new Student("Ronald", 36);
		Student billiam = new Student("Billiam", 156);
		Student newStudent = new Student();
		System.out.println(ronald.name);
		System.out.println(billiam.name + " is " + billiam.age + " years old.");
		System.out.println(newStudent.name);
		System.out.println(billiam);
		billiam.incrementAge();
		System.out.println(billiam);
		billiam.incrementAge(500);
		System.out.println(billiam);
		Course math = new Course("Math");
		math.enrollStudent(billiam);
		math.enrollStudent(ronald);
		System.out.println(math);
		School mantua = new School ("Mantua");
		mantua.addCourse(math);
		System.out.println(mantua);
		District fairfax = new District("Fairfax","Bob Boberson", mantua);
		System.out.println(fairfax);
	}

}
