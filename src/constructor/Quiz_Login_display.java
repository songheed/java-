package constructor;

import java.util.Scanner;

public class Quiz_Login_display {
	private Quiz_LoginDTO_1 t;
	Scanner input = new Scanner(System.in);
	String id, pwd;

	public void display() {
		int num=0;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.print(">>>");
			num = input.nextInt();

			switch(num) {
			case 1 : 
				if(t.getId()== null)  {
					System.out.println("회원가입 먼저 하세요");
				}else if(id.equals(t.getId()))  {
					if(pwd.equals(t.getPwd())) {
						System.out.println("인증 통과");
					}else {
						System.out.println("비밀번호가 틀렸습니다");
					}
				}else {
					System.out.println("존재하지 않는 id입니다.");
				}
				break;
			case 2 : 
				if(t.getId() == null) {
					System.out.println("등록할 id :");
					id = input.next();
					System.out.println("등록할 비밀번호 : ");
					pwd = input.next();
				}else {
					System.out.println("탈퇴 후 진행하세요");
				}
				break;
			case 3 : 
				t = null ;
				break;
			}
		}
	}


}
