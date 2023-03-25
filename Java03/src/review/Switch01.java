package review;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
				
		while(true)
		{
			System.out.println("숫자를 입력하시오(0~3) : ");
			num = sc.nextInt();
			
			switch(num) {
			case 0:	
				System.out.println(num+"을 입력했습니다.");
				break;
			case 1: 
				System.out.println(num+"을 입력했습니다.");
				break;
			case 2: 
				System.out.println(num+"을 입력했습니다.");
				break;
			case 3: 
				System.out.println(num+"을 입력했습니다.");
				break;
			default:
				System.out.println("Error");
				break;				
			}
			if(num>5) break;
		}
	}
}
