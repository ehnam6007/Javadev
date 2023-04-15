package except;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		try {
			System.out.println("숫자를 입력하세요");
			a = sc.nextInt();
			
			a = Integer.parseInt(sc.nextLine());
			System.out.println(a);
			System.out.println("프로그램 종료!");
		}
		catch(Exception e){
		System.out.println("예외처리");
		}
		
	}

}
