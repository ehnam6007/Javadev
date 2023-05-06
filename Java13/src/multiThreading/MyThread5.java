package multiThreading;

import java.util.Scanner;

public class MyThread5 {
	public static void main(String[] args) {
		// 하나의 쓰레드에서 list에 값 저장, 다른 쓰레드에서는 전체 출력
		MyModel mm = new MyModel();
		SaveList s1 = new SaveList(mm);
		PrintList p1 = new PrintList(mm);
		mm.list.add("sample0");
		
		//join : s1쓰레드가 수행되기 전까지 다른 쓰레드는 대기해라.
		s1.start();
		try {
			s1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p1.start();
	}

}

class SaveList extends Thread {
	private MyModel mm;

	public SaveList(MyModel myModel) {
		mm = myModel; // 객체의 주소를 전달받는다.
		//생성자()
	}

	public void Run() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (true) {
			if (str.equals("0")) {
				break;
			}
			System.out.println("저장할 항목을 입력하세요(0을 입력하면 종료)>>");
			str = sc.nextLine();
			mm.list.add(str);
		}
		// run()
		// SaveList{}
	}
}

class PrintList extends Thread {
	private MyModel mm;
	
	public PrintList(MyModel mm) {
		this.mm = mm;
	}
	public void Run() {
		for(String str : mm.list) {
			System.out.println(str+"");
		}
	}
	

}