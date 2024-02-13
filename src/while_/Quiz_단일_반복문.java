package while_;

import java.util.Scanner;

public class Quiz_단일_반복문 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
//	로그인 프로그램
//	처음에 로그인을 하면 저장되어 있는 값이 없어 비교할 수 없고,
//	회원가입을 먼저 진행하고 로그린 시도후 회원가입할때의 아이디와 로그인 할때의
//	아이디가 같은지 비교하라.
	int num;
	String pw = null, id = null , P=null, I = null;
	boolean bool = true;
	while(bool) {
		System.out.println("1.로그인\n2.회원가입\n3.나가기\n>>>");
		num = input.nextInt();
		if(num == 1) {
			if(id == null) {
				System.out.println("회원가입을 하세요.");
				continue;
			}else if(id != null) { 
				while(bool){
					System.out.println("아이디 입력 : ");
					I = input.next();
					System.out.println("비밀번호 입력 : ");
					P = input.next();
						if(id.equals(I) && pw.equals(P)) {
							System.out.println("인증 성공");
							break;
							}else if(id.equals(I)) {
								System.out.println("비밀번호가 틀렸습니다.");
								continue;
							}else {
								System.out.println("아이디가 다릅니다.");
								continue;
								}
						}
			}continue;
			}else if(num == 2) {
			System.out.println("아이디 입력 : ");
			id = input.next();
			System.out.println("비밀번호 입력 : ");
			pw = input.next();
			System.out.println("가입 완료!!");
			continue;
			}else if(num == 3) {
				break;
			}
		}

}
}