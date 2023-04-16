package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
		// 자바에서 랜덤을 사용하는 법 : Math클래스 또는 Random클래스 사용
		MyRandom md = new MyRandom();
		md.go5();
		
		MyRand mr = MyRand.getInstance();
		//mr.go4();


	}

}

class MyRandom {
	// nextInt() : 0 ~ 0.9999까지 랜덤
	public void go1() {
		// 0~9 랜덤 생성
		Random random = new Random();
		int result = random.nextInt(10); // 0~9까지 랜덤(0*10 ~ 0.99..*10)
		System.out.println(result);
	}

	public void go2() {
		Random random = new Random();
		int result = random.nextInt(6) + 100;
		System.out.println(result);
	}
	/*
	 * public void go3() { Random random = new Random();
	 * 
	 * int arr[] = {0,};
	 * 
	 * for(int i=1;i<7;i++) { arr[i] = random.nextInt(46); if(arr[i]!=arr[i-1]) {
	 * System.out.println(arr[i]);} else {i--;} } }
	 */
	
	public void go5() {
		int result = (int)(Math.random()*10) +1;
		System.out.println(result);
		
	}

}
class MyRand{
	private MyRand() {}
	
	private static MyRand instance;
	
	public static MyRand getInstance() {
		if(instance ==null) {
			instance = new MyRand();
		}
		return instance;
	}
	
	public void go4() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("숫자를 입력하시오");
		int get1 = sc.nextInt();
		System.out.println("숫자를 입력하시오");
		int get2 = sc.nextInt();
		int tmp =0;
		
		if(get1>get2) {
			tmp = get1;
			get1 = get2;
			get2 = tmp;	
		}
		
		for (int i = 0; i < 50; i++) {
			int result = random.nextInt(get2-get1+1) + get1;
			if (result < get2) {
				System.out.println(result);
			} else {};
		}
	}
	
}

























