package review;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money=0;
		int top, bottom=0;
		String str_n = null;
		
		System.out.println("금액을 입력하시오");
		money = sc.nextInt();
		
		if(money<1000) {
			System.out.println(money);	
		}
		else if(money<1000000) {
			top = money/1000;
			bottom = money%1000;
			if(bottom<10) str_n="00"+bottom;
			else if(bottom<100) str_n="0"+bottom;
			else if(bottom<1000) str_n = ""+bottom;
			System.out.println(top+","+str_n);
		}
		else {System.out.println("Error");}
	}

}
