package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int money=0;
		
		System.out.println("나이를 입력해 주세요 ↓↓↓");
		age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
			money=1000;
		}
		else if(age>=14) {
			System.out.println("청소년입니다.");
			money=650;
		}
		else {
			System.out.println("어린이입니다.");
			money=400;
		}
		System.out.println(money+"원");
	}
}