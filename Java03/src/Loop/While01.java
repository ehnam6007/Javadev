package Loop;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		/*
		int i=1,num=0,num2=0;
		
		while(i<=50) {
			num+=i;
			i++;
		}
		System.out.println("1부터 10까지의 합은 "+num+"입니다.");
		
		System.out.println("");
		for(int j=1;j<=50;j++) num2+=j;
		System.out.println("1부터 10까지의 합은 "+num2+"입니다.");
		*/
		Scanner sc = new Scanner(System.in);
		int i=1,num=0,sum=0;
		
		System.out.println("1부터 더할 숫자를 입력하시오 ");
		num = sc.nextInt();
		
		for(i=0;i<=num;i++) sum+=i;
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다");
		
	}
}
