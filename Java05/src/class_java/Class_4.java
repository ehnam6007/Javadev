package class_java;

public class Class_4 {
	public static void main(String[] args) {
		int result = 3+4;
		MyClass4 mc4 = new MyClass4();
		int result2 = mc4.plus(3,4);
		System.out.println(result2);
	}

}
class MyClass4{
	int plus(int num1,int num2) {
		int result = num1 + num2;
		return result;
		
	}
}