package overriding;


class Ferrari{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye; //생성자 
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km 달립니다");
	}
	public void onCar() {
		System.out.println("자동차 시동을 켭니다.");
	}
}
//class NewFerrari extends Ferrari{ 
//	public NewFerrari(int ye) {
//		super(ye);
//	}
//	public void autoSystem() {
//		System.out.println("자동 운전모드를 실행합니다.");
//	}
//}

//오버 라이딩
class NewFerrari extends Ferrari{ 
	public void speed() {
		System.out.println(getYe() + "년식 페파리 속도 변경");
		System.out.println("500km까지 달릴수 있습니다.");
	}
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전모드를 실행합니다.");
	}
}



public class Ex01 {
	public static void main(String[] args) {
//		Ferrari f = new Ferrari(2024);
//		f.onCar();
//		f.speed();
		
		NewFerrari f = new NewFerrari(2025);
		f.onCar();
		f.speed(); 
		f.autoSystem();
		
		//부모가 가지고있는 메소드를 수정하려면
		
		
		
		
	}
}
