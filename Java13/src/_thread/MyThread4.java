package _thread;

public class MyThread4 {
	public static void main(String[] args) {
		// 쓰레드 추가 생성 : Thread 상속받은 클래스
		// 쓰레드 추가 생성 : Runnable Interface를 지정받은 클래스
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread(r1);
		
		t1.start();
	}

}
class MyRunnable1 implements Runnable{
	// 인터페이스를 상속받으면 클래스 밑에 빨간줄이 생성되는데, 마우스를 올리고 Add unimplemented methods를 클릭하여 미 구현된 메서드를 추가한다.
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(i+" Runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

