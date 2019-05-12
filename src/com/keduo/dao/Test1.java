import java.util.Scanner;

import com.keduo.dao.User;
//哈哈哈哈哈哈哈
public class Test1 {

	static User[] userList=new User[3];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		User user1=new User("a", 12, "男");
		User user2=new User("b", 13, "女");
		User user3=new User("c", 14, "男");
		
		userList[0]=user1;
		userList[1]=user2;
		userList[2]=user3;	
		login();
	}
	public static void login(){
		int j=0;
		int count=0;
		while (true) {
			if(count==3){
				System.out.println("登录失败,你的三次机会已经用完了!!!");
				System.exit(0);
			}
			boolean flg=true;
			System.out.println("请输入用户名:");
			String name=sc.next();
		
			for(int i=0;i<userList.length;i++){
				if(userList[i].getName().equals(name)){
					flg=false;
					j=i;
					
					
				}
				
				
			}
			if (flg) {
				System.out.println("你的用户名错误,请重新输入:");
				continue;
			}
			System.out.println("请输入密码:");
			int password=sc.nextInt();
			
				if(password==userList[j].getpassword()){
					System.out.println("登录成功");
					return;
				}else {
					System.out.println("密码错误，请重新输入:");
					count++;
				
			}
			
			
		}
		
		
		
		
		
	}
	
}
