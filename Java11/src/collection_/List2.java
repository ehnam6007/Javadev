package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		ArrayList2 a2 = new ArrayList2();
		Scanner sc = new Scanner(System.in);
		a2.setMenuPrice();

		System.out.println("==항목을 선택하세요==");
		System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");

		int choice = sc.nextInt();
		String str = "";
		int num;

		switch (choice) {
		case 0:
			System.out.println("종료");
			break;
		case 1:
			System.out.println("추가할 메뉴를 입력하세요 >> ");
			str = sc.next();
			num = sc.nextInt();
			a2.addMenuPrice(str, num);
		case 2:
			System.out.println("변경할 메뉴를 입력하세요 >> ");
			str = sc.next();
			a2.modifyMenuPrice(str);
		case 3:
			System.out.println("삭제할 메뉴를 입력하세요 >> ");
			str = sc.next();
			a2.deleteMenuPrint(str);
		case 4:
			a2.printMenu();

		}

	}

}

class ArrayList2 {
	ArrayList<String> menu = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	public void setMenuPrice() {
		menu.add("라면");
		menu.add("김밥");
		menu.add("떢볶이");
		menu.add("순대");

		price.add(1000);
		price.add(2000);
		price.add(3000);
		price.add(4000);
	}

	public void addMenuPrice(String str, int num) {
		menu.add(str);
		price.add(num);
	}

	public void modifyMenuPrice(String str) {

	}

	public void deleteMenuPrint(String str) {
		menu.remove(str);

	}

	public void printMenu() {
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + " : " + price.get(i));
		}
	}
}
