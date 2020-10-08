package com.firstproject.helloworld;

public class Student {
	
	public String name;
	public int age;
	
	//constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//constructor overloading
	public Student() {
		this.name = "New Student";		
	}
	
	//method overriding
	@Override	
	public String toString()
	{
		return this.name + " " + this.age;
	}
	
	public void incrementAge() {
		this.age++;
	}
	
	public void incrementAge(int a) {
		this.age = a;
	}

}
