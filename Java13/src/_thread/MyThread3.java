package _thread;

import java.util.Scanner;

public class MyThread3 {
	public static void main(String[] args) {
		MyInput1 MI1 = new MyInput1();
		MyInput2 MI2 = new MyInput2();
		MI1.start();
		MI2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("배경 음악 재생 중 ~ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyInput1 extends Thread {
	private Scanner sc;
	private String str;

	public MyInput1() {
		sc = new Scanner(System.in);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			keyboard();
		}
	}

	public void keyboard() {
		System.out.print("입력 >> ");
		str = sc.nextLine();
		System.out.println("입력 내용 : " + str);
	}

}

class MyInput2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍멍멍멍");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}