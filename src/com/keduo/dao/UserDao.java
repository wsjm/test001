package com.keduo.dao;

import java.util.Scanner;

public class UserDao {

	static Object[][] users={{"A",12,"男"},{"b",22,"女"},{"c",23,"女"}};
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		
		Test2 test2=new Test2();
		test2.m();

		System.out.println("1.功能菜单");
		System.out.println("2.添加用户");

		System.out.println("3.删除用户");
		System.out.println("4.修改用户");
		System.out.println("5.查询用户");
		System.out.println("6.查询用户");
		System.out.println("请输入你的选择：");
		int  n=sc.nextInt();
		switch (n) {
		case 1:
System.out.println("功能菜单");
			break;
		case 2://添加
			insert();
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;

		default:
			break;
		}
	}
	//添加
	public static void insert(){
		//数组的扩容
		
		Object[][] userList=new Object[users.length+1][3];
		System.out.println("--------------");
		for (int i = 0; i < users.length; i++) {
			userList[i]= users[i];
			
			System.out.println(userList.length);
			
		}
		
		while (true) {
			
			System.out.println("请输入你要添加的用户名:");
			String name=sc.next();
			System.out.println("请输入你的密码:");
			int password=sc.nextInt();
			System.out.println("请输入你的性别:");
			String sex=sc.next();
			 User user=new User(name,password,sex);
			 
			//System.out.println(userList.length);
			
			
			
		}
		}
	


}
