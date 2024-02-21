package set_get;

class Test010{
	private int kor, eng, math, sum;
	private double avg;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void setAge(double age) {
		this.avg = age;
	}
	
	
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		this.sum = kor+eng+math;
		return sum;
	}
	public double getAvg() {
		this.avg = sum / 3.0;
		return avg ;
	}
}

public class Quiz_Test_02 {

}
