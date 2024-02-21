package set_get;

public class Quiz_Main_01 {
	public static void main(String[] args) {
		test1  t = new test1();
		t.setName(null);
		t.setAge(0);
		System.out.println(t.getName()+"님의 나이는 " +t.getAge() + "입니다.");
	
		
	}	
}
