package except;

import java.util.Scanner;

public class Try2 {
	// try-catch를 사용해서 나누기를 해보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("숫자를 입력하세요 ↓↓");
				int num1 = sc.nextInt();
				System.out.println("숫자를 입력하세요 ↓↓");
				int num2 = sc.nextInt();
				
				int num3 = num1 / num2;
				System.out.println("첫번째 입력값을 두번째 입력값으로 나눈 결과값은 " + num3 + "입니다.");

			} catch (Exception e) {
				System.out.println("예외처리"+e);
				break;
			}
		}
	}
}
