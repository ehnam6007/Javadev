package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		Thread Jenny = new Thread(dr,"Jenny");
		Thread Sunny = new Thread(dr,"Sunny");
		Thread Merry = new Thread(dr,"Merry");
		
		Jenny.start();
		Sunny.start();
		Merry.start();
	}

}
class DressRoom implements Runnable{

	public void run() {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			System.out.println(name+" 의상실로 들어갑니다");
			for(int time=1;time<6;time++) {
				System.out.println(name+" 의상실 사용중... "+time+"초");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name+" 의상실에서 나옵니다.");
		}
		
	}
	
}