package Condition;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		
		System.out.println("점수를 입력해 주세요 ↓↓↓");
		score = sc.nextInt();
		if(score>=90){System.out.println(score+"점 이라니 우등생 입니다!!");}
		else{System.out.println(score+"점 이라니 참 잘하셨습니다!");}
	}
}

