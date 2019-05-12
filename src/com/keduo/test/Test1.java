package com.keduo.test;

public class Test1 {
public static void main(String[] args) {
	Student stc=new Student(null, 0);
	stc.method();
	System.out.println(stc.getName());
}
}

class Student{
	private String name;
	private int age;
	
	
	
	public Student(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	public void method(){
		System.out.println(name);
	}
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
}