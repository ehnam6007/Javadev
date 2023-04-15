package except;

import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		// 예외처리 : 사용자가 정상적인 방법으로 프로그램을 사용하지 않았을 경우에 대한 대비
		// 0으로 나누기, 숫자를 입력하라고 했는데 글자를 입력한다든지, 0~4를 입력하라 했는데 -1을 입력한다던지... 등
		Scanner sc = new Scanner(System.in);
		MyClass5 mc5 = new MyClass5();

		while (true) {
			System.out.println("숫자1을 입력하세요>>");
			int num1 = sc.nextInt();
			System.out.println("숫자2를 입력하세요>>");
			int num2 = sc.nextInt();

			/*
			if(num2!=0) {
			mc5.divide(num1, num2);
			}else System.out.println("0으로 나눌 수 없습니다.");
			*/
			// 모든 경우에 대해 예외처리를 해줄 수 없기 때문에 try~catch라는 것을 제공
			try {
				mc5.divide(num1, num2);
			}catch(Exception e){
				System.out.println("나누기 할 때 예외가 발생했습니다.");
			}
				
			}
		}
}

class MyClass5 {
	// 나누기한 결과를 출력
	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}