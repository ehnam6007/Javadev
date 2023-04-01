package class_java;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		int a = 9, b = 4;

		System.out.println("+ Result : " + mc7.plus(a, b));
		System.out.println("- Result : " + mc7.minus(a, b));
		System.out.println("* Result : " + mc7.mpln(a, b));
		System.out.println("/ Result : " + mc7.div(a, b));
		System.out.println("% Result : " + mc7.remain(a, b));

	}

}

class MyClass7 {
	int plus(int a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a - b;
	}

	int mpln(int a, int b) {
		return a * b;
	}

	int div(int a,int b) {
		int result1;
		if (b == 0) {
			result1 = 0;
		} else {
			result1 = a/b;
		}
		return result1;
	}
	
	int remain(int a, int b) {
		int result2;
		if (b == 0) {
			result2 = 0;
		} else {
			result2 = a % b;
		}
		return result2;
	}
}
