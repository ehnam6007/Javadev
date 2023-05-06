package multiThreading;

public class MyThread6 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();
		MyThread02 m2 = new MyThread02(mm);
		MyThread01 m1 = new MyThread01(mm);
		MyThread03 m3 = new MyThread03(mm);
		
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m2.start();
		try {
			m2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m3.start();

	}

}

class MyThread01 extends Thread {
	private MyModel mm;

	public MyThread01(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		mm.list.add("안녕");
		System.out.println("반갑");
	}

}

class MyThread02 extends Thread {
	private MyModel mm;

	public MyThread02(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		for (String str : mm.list) {
			System.out.println(str);
		}
	}

}

class MyThread03 extends Thread {
	private MyModel mm;

	public MyThread03(MyModel mm) {
		this.mm = mm;
	}

	public void run() {
		mm.list.set(0, "반갑!");
		System.out.println("Thread5");
		for (String str : mm.list) {
			System.out.println(str);
		}
	}
}