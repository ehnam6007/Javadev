package Condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year=0;
		int score=0;
		int passwd=0;
		int yyear=0;
		
		System.out.println("나이를 입력해 주세요 ↓↓↓");
		year = sc.nextInt();
		if(year>=20) {System.out.println("성인");}
		else if(year>=14){System.out.println("청소년");}
		else if(year<14) {System.out.println("어린이");}
		
		System.out.println("점수를 입력해 주세요 ↓↓↓");
		score=sc.nextInt();
		if(score>=90) {System.out.println("학점 A");}
		else if(score>=80){System.out.println("학점 B");}
		else if(score>=70){System.out.println("학점 C");}
		else if(score<70){System.out.println("학점 F");}
		
		System.out.println("패스워드를 입력해 주세요 ↓↓↓");
		passwd=sc.nextInt();
		if(passwd==12345) {System.out.println("비밀번호가 맞습니다.");}
		else{System.out.println("Error");}
		
		System.out.println("년도를 입력하세요 ↓↓↓");
		yyear=sc.nextInt();
		if((yyear%4)==0) {System.out.println("윤년");}
		else {System.out.println("윤년아님");}
		
	}

}
