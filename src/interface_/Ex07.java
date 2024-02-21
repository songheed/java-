package interface_;

public class Ex07 {
	public static void main(String[] args) {
//		TestClass07 t01 = new TestClass07();
//		TestClass07 t02 = new TestClass07();
//		TestClass07 t03 = new TestClass07();
//		TestClass07 t04 = new TestClass07();
//		TestClass07 t05 = new TestClass07();
		
		
		
		TestInt07 t01 = Singleton07.getInstance();
		TestInt07 t02 = Singleton07.getInstance();
		TestInt07 t03 = Singleton07.getInstance();
		TestInt07 t04 = Singleton07.getInstance();
		t01.test();
}
}

