package Loop;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	
		
		/* 
		//과제1
		int num=0,sum1=0,sum2=0;
		
		for(int i=0;i<5;i++) System.out.print("안녕 ");
		System.out.println();
		
		//과제2
		for(int i=1;i<=10;i++) sum1+=i;
		System.out.println(sum1);
		
		//과제3
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) sum2+=i;
		System.out.println("1부터 "+num+"까지의 합은 "+sum2+"입니다.");
		*/
	}

}
