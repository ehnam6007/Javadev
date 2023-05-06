package _thread;

import java.util.Scanner;

public class MyThread2 {
	public static void main(String[] args)  {
		// 컴퓨터 Power on > OS 실행 > 프로그램 실행 
		// 프로그램 : 코드로 작성된 작업지시서(이클립스, 크롬, 게임)
		// 프로세스 : 실행중인 프로그램(프로그램을 프로세스에 등록했다.)
		//쓰레드 : 프로세스 안에서 코드를 한줄 씩 실행하는 단위
		
		// main함수 안에는 기본적으로 주쓰레드(main 쓰레드)가 있어 main 함수로부터 실행할 수 있음.
		// 동시에 실행하고자하는 기능이 있다면 한명의 노동자로는 부족함.
		// 쓰레드 추가 생성
		
		// 자바에서 쓰레드를 생성하는 방법(2) : 1. Thread 상속 or 2. Runnable 인터페이스를 지정받은 클래스
		// 추가쓰레드에서 동작정의 : run() 메서드
		// 추가쓰레드 사용 : start() 메서드
		MyInput input = new MyInput();
		input.start();		//start() 메서드를 통해서 run() 메서드를 추가쓰레드 진행
		
		for(int i=0;i<100;i++) {
			System.out.println("배경음 재생 중 ~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		//ms단위, 1초 지정
		}

	
	}

}
//Thread 추가/생성을 위해선 Thread를 상속받은 클래스가 필요
class MyInput extends Thread{
	private Scanner sc;		//멤버변수
	private String str;
	
	public MyInput() {	//생성자
		sc = new Scanner(System.in);
		
	}
	//쓰레드는  run() 메서드를 통해서 구현
	@Override
	public void run() {
		//동시에 실행하고 싶은 작업을 구현(추가 노동자가 동시에 할 작업)
		for(int i=0;i<100;i++) {
			keyboard();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void keyboard() {
		System.out.print("입력 >>");
		str = sc.nextLine();
		System.out.println("나의 입력 내용 : "+str);
		
	}
}





//생성자와 멤버변수의 지정 위치에 따른 차이
// next(), nextline(), nextint() next와 나머지의 차이