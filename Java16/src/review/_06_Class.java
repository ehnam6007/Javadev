package review;

public class _06_Class {
	public static void main(String[] args) {
		//다른 클래스의 변수나 메서드를 사용하고 싶으면 '객체화' 필요
		//객체화에서 클래스는 자료형으로 사용
		// 클래스를 자료형으로 사용해서 변수를 선언
		MyClass6 myclass6 = new MyClass6();		//객체화
		
		
		// 변수와 메서드는 '객체'를 통해서 사용
		myclass6.func1();
		
		
		
		
	}

}
//클래스 : 변수들과 함수들을 묶어놓은 세트
class MyClass6{
	//변수 -> private 멤버변수 
	private int num;
	private double dnum;
	private String str;
	
	public void func1() {}
	
}
