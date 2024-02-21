package constructor;

import java.util.Scanner;

public class Quiz_MemverService_02 {

	private Quiz_MemberDTO t;
	public Quiz_MemverService_02()	{t = new Quiz_MemberDTO();}
	


	public void display() {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math, sum;
		double avr;
		
		while(true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 학생보기");
			System.out.println("3. 정보수정");
			System.out.println("4. 회원탈퇴");
			System.out.println(">>>>>");
			int num = input.nextInt();
			switch (num) {
			//학생 등록
			case 1:
				System.out.println("이름 : ");
				name = input.next();
				System.out.println("국어 점수 : ");
				kor = input.nextInt();
				System.out.println("영어 점수 : ");
				eng = input.nextInt();
				System.out.println("수학 점수 : ");
				math = input.nextInt();
				System.out.println("완료");
				t.setSum(kor + eng + math);
				t.setAvr(t.getEng() / 3.0);
				t.setName(name); t.setKor(kor);
				t.setEng(eng); t.setMath(math);
				break;

				//학생보기
			case 2:
				System.out.println("이름 : " + t.getName());
				System.out.println("국어 점수 : " +t.getKor());
				System.out.println("영어 점수 : " +t.getEng());
				System.out.println("수학 점수 : " +t.getMath());
				
				System.out.println("합 : " + t.getEng());
				if(t.getSum() >= 90) {
					System.out.println("등급 : A");
				}else if(t.getSum() >=80 && t.getSum() < 90) {
					System.out.println("등급 : B");
				}else {
					System.out.println("등급 : C");
				}
				break;

				//정보 수정
			case 3:
				while(true) {
					System.out.println("1. 이름");
					System.out.println("2. 국어점수 수정");
					System.out.println("3. 영어점수 수정");
					System.out.println("4. 수학점수 수정");
					num = input.nextInt();
					switch(num) {
					case 1: 
						System.out.println("이름은 수정할 수 없습니다.");
						break;
					case 2: 
						System.out.println("수정할 국어점수 : ");
						kor = input.nextInt();
						t.setKor(kor);
						break;
					case 3: 
						System.out.println("수정할 영어점수 : ");
						eng = input.nextInt();
						t.setEng(eng);
						break;
					case 4: 
						System.out.println("수정할 수학점수 : ");
						math = input.nextInt();
						t.setMath(math);
						break;
					}break;
					
				}



				//회훤 탈퇴
			case 4:
				t = null;
				System.out.println("탈퇴");
				break;

			}
		}
	}
}
