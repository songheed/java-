package class_;

public class TestClass09 {
	public void test1() {
		for(int i=0; i<5 ;i++) {
			System.out.println(i);
			if(i==3)
//				break;
				return; //반환값이 없어도 사용가능 
						//반환타입이 void이면 return만
		}
		System.out.println("test1 종료"); 
		//return실행시 종료는 출력되지않는다.
		//return이 위치해 있는곳에서 돌아간다.
		
	}
		public int test2() {
			int n = 10; //사용자에게 입력값을 받았다고 가정
			if(n>100)
				return 100;
		//if문에서 초기화가 되지않을 수 있어 Error발생
//			else //도 사용할수 있다.
			return 0; //int형테로 돌려주는 return
			//0은 의미가 없는 값으로 값이 필요없을때 사용
		}
		public String test3() {
			int num = 100;
			if(num>10)
				return "문자열";
			else
				return "100:"; //에러 : rturn 100;
				
		}
		public String test4() {
			return "aaa";//,"bbb","ccc";
			//값은 1개만 
		}
	
}
