import java.util.Scanner;

import com.keduo.dao.User;
//��������������
public class Test1 {

	static User[] userList=new User[3];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		User user1=new User("a", 12, "��");
		User user2=new User("b", 13, "Ů");
		User user3=new User("c", 14, "��");
		
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
				System.out.println("��¼ʧ��,������λ����Ѿ�������!!!");
				System.exit(0);
			}
			boolean flg=true;
			System.out.println("�������û���:");
			String name=sc.next();
		
			for(int i=0;i<userList.length;i++){
				if(userList[i].getName().equals(name)){
					flg=false;
					j=i;
					
					
				}
				
				
			}
			if (flg) {
				System.out.println("����û�������,����������:");
				continue;
			}
			System.out.println("����������:");
			int password=sc.nextInt();
			
				if(password==userList[j].getpassword()){
					System.out.println("��¼�ɹ�");
					return;
				}else {
					System.out.println("�����������������:");
					count++;
				
			}
			
			
		}
		
		
		
		
		
	}
	
}
