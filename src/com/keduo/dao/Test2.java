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
			System.out.println("��¼ʧ�ܣ����Ѿ���¼��3����");
			System.exit(0);
		}
		System.out.println("����������û���:");
		String name=sc.next();

			for(int i=0;i<UserDao.users.length;i++){
			if(name.equals(UserDao.users[i][0])){
				a=i;
				flg=false;
		a=i;
			
			}
			
	}
		if (flg) {
			System.out.println("�û�����������������:");
			continue;
		}
		
		//��������
		System.out.println("����������:");
		String password=sc.next();
		
		for(int i=0;i<UserDao.users.length;i++){
			if(password.equals(UserDao.users[a][1])){
				
				System.out.println("��¼�ɹ�");
				
				break;
				
			}count++;
			for (int j = 0; j < UserDao.users.length; j++) {
				System.out.println(UserDao.users[j]);
			}
			System.out.println("������������µ�¼");
			break;
			
			
		}
			
			
		}
			
			
		
}
}




