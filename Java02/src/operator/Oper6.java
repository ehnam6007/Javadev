package operator;

public class Oper6 {
	public static void main(String[] args) {
		System.out.println(!(2>1 && 2==3));
		System.out.println(2>1 || 2==3);
		System.out.println(2!=1);
		
		int height = 120;
		int year=14;
		boolean tf = height>130 && year>=13;
		System.out.println(!tf);
		tf = height>130 || year>13;
		System.out.println(tf);
		
		int a=123;
		int b=456;
		int num = (3>2) ? a : b;
		System.out.println(num);
	}
}
