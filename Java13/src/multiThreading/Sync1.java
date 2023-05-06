package multiThreading;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드 환경에서 '동기화' 진행 - 클래스를 동기화 해서 여러 스레드가 동시에 접근하는것을 방지함
		// Runnable
		Toilet toilet = new Toilet();
		Thread 홍길동 = new Thread(toilet, "홍길동");
		Thread 이순신 = new Thread(toilet, "이순신");

		홍길동.start();
		이순신.start();
	}
}

class Toilet implements Runnable {
	private int time;

	public void run() {
		synchronized (this) { // 이 클래스는 동기화 시킬거다.
			String name = Thread.currentThread().getName();
			System.out.println(name + " 화장실 들어감");
			for (time = 1; time <= 5; time++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " 화장실 사용 중... " + time + "초");
			}
			System.out.println(name + " 화장실 나옴");

		}
	}

}
