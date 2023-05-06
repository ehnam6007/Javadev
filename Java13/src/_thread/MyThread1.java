package _thread;

import java.util.Scanner;

public class MyThread1 {
	public static void main(String[] args) {
		// 기존에는 main thread 1개만 사용해왔음. 그러나 main thread 혼자사는 윗줄부터 아래로 하나씩 실행(동시 실행이 불가능)
		// '동시 작업을 할 필요가 있을 때' thread를 이용함.

		Scanner sc = new Scanner(System.in);


		// 10초 동안 배경음
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음>>");	//배경음 재생 하면서
			System.out.println("채팅입력>>");	//채팅도 입력하면서
			String str = sc.nextLine();
			System.out.println(str);
			System.out.println("상대방 채팅>>");	//상대방이 입력하는 채팅도 보여야함.
		}
		System.out.println("결론 : main thread 하나만으로는 동시 작업이 불가능");
		// 쓰레드 추가 생성 필요
		

	}

}
