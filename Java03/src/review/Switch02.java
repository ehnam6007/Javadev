package review;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("정수를 입력하시오(1~4) : ");
		num = sc.nextInt();
		
		switch(num) {
			case 1: 
				System.out.println("안녕하세요");
				break;
			case 2: 
				System.out.println("반가워요");
				break;
			case 3: 
				System.out.println("잘있어요");
				break;
			case 4: 
				System.out.println("다시만나요");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");			
		}
	}
}
