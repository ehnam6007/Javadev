package Loop;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		// 시험 결과 출력하기
		Scanner sc = new Scanner(System.in);
		int KOR = 0, ENG = 0, Math = 0;
		
		while(true)
		{
			System.out.print("국어 점수를 입력하시오 : ");
			KOR = sc.nextInt();
			System.out.print("영어 점수를 입력하시오 : ");
			ENG = sc.nextInt();
			System.out.print("수학 점수를 입력하시오 : ");
			Math = sc.nextInt();
	
			int Total = KOR + ENG + Math;
			
			if (KOR < 40 || ENG < 40 || Math < 40) {
				System.out.println("과락입니다.");
			} else if (Total < 150) {
				System.out.println("총점 미달입니다.");
			} else {
				System.out.println("합격입니다!");
				break;
			}

		}		// 1~10 합계 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println();
		System.out.println("1~10까지의 합은 " + sum + "입니다.");
		System.out.println();

		// 10~1까지 거꾸로 출력하기
		for (int j = 0; j < 10; j++) {
			System.out.print(10 - j + " ");
		}

	}

}
