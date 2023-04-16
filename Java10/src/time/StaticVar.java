/*
package time;

public class StaticVar {
	//이렇게 하면 안됨. 싱글턴 사용할 것(성능이 느려짐)
	
	static String str1 = "안녕하세요";
	static String str2 = "반갑습니다.";
	static int num1 = 314;
	static int nums[] = new int[100];	//성능 매우 느려짐.
	
	public static void main(String[] args) {
		Test.print();
	}
}
class Test{
	public static void print() {
		System.out.println(StaticVar.str1);
		StaticVar.nums[0] = 0;
		StaticVar.nums[1] = 1;
		StaticVar.nums[2] = 2;
		
		System.out.println(StaticVar.num1);
	}
}
*/