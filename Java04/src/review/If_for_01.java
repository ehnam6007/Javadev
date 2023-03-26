package review;

public class If_for_01 {
	public static void main(String[] args) {
		int flag = 1;

		if (flag != 0)
			for (int i = 0; i <= 5; i++) {
				System.out.println("조건문 안에 반복문 : " + i);
			}
		flag = 0;

		int num = 1;

		if (num == 1)
			for (int i = 0; i < 5; i++) {
				System.out.println("1 이다.");
			}
	}
}