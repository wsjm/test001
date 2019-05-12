package com.keduo.test;

 public class Test2{
	 public static void main(String[] args) {
		 Dog dog=new Dog();
		 dog.setName("哈士奇");
		 dog.setAge(5);
		// dog.setSex(true);
		 
		 System.out.println("我是一只"+dog.getName());
		 System.out.println("现在"+dog.getAge()+"岁");
		 dog.m();
		 if(dog.getSex()==false){
			 System.out.println("我是只母狗");
		 }else {
			System.out.println("我是只公狗");
		}
		
		
	}
	 
	
 }

 
 class Dog{
	 private String name;
	 private int age;
	 private boolean sex;
	 
	
	public String getName(){
		 return name;
	 }
	 public void setName(String name){
	 this.name=name;
	 }
	 public int getAge(){
		 return age;
	 }
	 public void setAge(int age){
		 this.age=age;
	 }
	 public boolean getSex(){
		 return sex;
	 }
	 public void setSex(Boolean sex){
		 this.sex=sex;
	 }
	private void eat() {
		System.out.println("傻呵呵的吃东西");
	}
	public void m(){
		eat();
	}
	 }
	
 