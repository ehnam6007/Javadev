package Loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, passwd = 0;

		//짝수 출력(1~10)
		System.out.print("정수를 입력하시오 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1)
				continue;
			System.out.println(i + " 짝수");
		}

		//비밀번호 5회 맞추기.
		for (int j = 1; j <= 5; j++) {
			System.out.println("비밀번호를 입력하시오");
			passwd = sc.nextInt();

			if (passwd == 12345) {
				System.out.println("맞았습니다!");
				break;
			} else if (j == 5)
				System.out.println("접속불가!");
			else
				System.out.println("틀렸습니다. 다시 입력하세요! ;" + j + "회 틀림");
		}
	}
}
