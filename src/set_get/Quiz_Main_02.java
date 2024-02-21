package set_get;

public class Quiz_Main_02 {
	public static void main(String[] args) {
		Test010 t = new Test010();
		int k=100, e=90, m=80;
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setMath(k+e+m);
		t.setAge(t.getSum() / 3.0);
		
		System.out.println("국어 : " +t.getKor());
		System.out.println("영어 : " +t.getEng());
		System.out.println("수학 : " +t.getMath());
		System.out.println("합 : " +t.getSum());
		System.out.println("평균 : "+t.getAvg());
		
	}	
}
