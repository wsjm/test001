package com.keduo.test;

 public class Test2{
	 public static void main(String[] args) {
		 Dog dog=new Dog();
		 dog.setName("��ʿ��");
		 dog.setAge(5);
		// dog.setSex(true);
		 
		 System.out.println("����һֻ"+dog.getName());
		 System.out.println("����"+dog.getAge()+"��");
		 dog.m();
		 if(dog.getSex()==false){
			 System.out.println("����ֻĸ��");
		 }else {
			System.out.println("����ֻ����");
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
		System.out.println("ɵ�ǺǵĳԶ���");
	}
	public void m(){
		eat();
	}
	 }
	
 