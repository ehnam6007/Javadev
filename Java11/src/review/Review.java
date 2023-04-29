package review;

public class Review {
	public static void main(String[] args) {
		MyClass2 m = new MyClass2();
		MyClass2 m2 = new MyClass2();	// m!= m2(싱글턴패턴이 아니면 서로 다른 존재)

		m.setNum(33);
		int num = m.getNum();
		if(num>0) System.out.println("양수입니다."+num);
		else System.out.println("음수입니다."+num);
	}

}

class MyClass2 extends MyClass {
	// extends(상속) : MyClass를 MyClass2에 복붙
}

class MyClass {
	private int num;
	private String str;
	private double dnum;
	private int number[] = new int[30];

	void setNum(int num) {
		this.num = num;
		String str = "";
	}

	int getNum() {
		return num;
	}

	MyClass() {
		num = 0;
		str = null;

	}

}