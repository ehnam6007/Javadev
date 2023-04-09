package cls;

public class Review2 {
	public static void main(String[] args) {
		사칙연산 n1 = new 사칙연산(3, 4);
		사칙연산 n2 = new 사칙연산(5, 5);
		n1.add();
		n2.add();
	}
}

class 사칙연산{
	private int num1;
	private int num2;
	
	// 생성자를 통해서 num1과 num2의 값을 받고
	사칙연산(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 멤버변수 num1과 num2를 더하기, 빼기, 곱하기, 나누기 하는 메서드를 각각 만들어보세요
	public int add() {
		System.out.println("결과:"+(num1+num2));
		return num1+num2;
	}
	
	public int sub() {
		System.out.println("결과:"+(num1-num2));
		return num1-num2;
	}
	
	public int mul() {
		System.out.println("결과:"+(num1*num2));
		return num1*num2;
	}
	
	public double div() {
		System.out.println("결과:"+((double)num1/num2));
		return (double)num1/num2;
	}
	
}