package com.keduo.dao;

import java.util.Scanner;

public class Test2 {
static Scanner sc=new Scanner(System.in);

public static void m(){
	int count=0;
	int a=0;
	 boolean flg=true;
	while (true) {
		if(count==3){
			System.out.println("登录失败，你已经登录了3次了");
			System.exit(0);
		}
		System.out.println("请输入你的用户名:");
		String name=sc.next();

			for(int i=0;i<UserDao.users.length;i++){
			if(name.equals(UserDao.users[i][0])){
				a=i;
				flg=false;
		a=i;
			
			}
			
	}
		if (flg) {
			System.out.println("用户名错误，请重新输入:");
			continue;
		}
		
		//输入密码
		System.out.println("请输入密码:");
		String password=sc.next();
		
		for(int i=0;i<UserDao.users.length;i++){
			if(password.equals(UserDao.users[a][1])){
				
				System.out.println("登录成功");
				
				break;
				
			}count++;
			for (int j = 0; j < UserDao.users.length; j++) {
				System.out.println(UserDao.users[j]);
			}
			System.out.println("密码错误，请重新登录");
			break;
			
			
		}
			
			
		}
			
			
		
}
}




