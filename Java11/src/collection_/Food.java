package collection_;

//import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodList FL = new FoodList();
		String str1 = "";
		String str2 = "";

		while (true) {
			System.out.println("==항목을 선택하세요==");
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
			int num = sc.nextInt();

			if (num == 0)
				break;
			else if (num == 1) {
				System.out.println("추가할 메뉴를 입력하시오");
				str1 = sc.next();
				System.out.println("메뉴의 가격을 입력하시오");
				int price = sc.nextInt();
				FL.FoodAdd(str1, price);
				System.out.println("메뉴가 정상적으로 추가되었습니다.");
				FL.ShowAll();

			} else if (num == 2) {
				System.out.println("변경전 메뉴를 입력하시오");
				str1 = sc.next();
				System.out.println("변경후 메뉴를 입력하시오");
				str2 = sc.next();
				FL.FoodSet(str1, str2);
				System.out.println("메뉴가 정상적으로 변경되었습니다.");
				FL.ShowAll();
			} else if (num == 3) {
				System.out.println("삭제할 메뉴를 입력하시오");
				str1 = sc.next();
				FL.FoodDel(str1);
				System.out.println("메뉴가 정상적으로 삭제되었습니다.");
				FL.ShowAll();
			} else
				FL.ShowAll();

		}

	}

}

class FoodList {
	ArrayList<String> menu = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	public FoodList() {
		String menus[] = { "김밥", "떢볶이", "순대" };
		int prices[] = { 1000, 2000, 3000 };

		menu.addAll(Arrays.asList(menus));
		for (int i = 0; i < prices.length; i++) {
			price.add(prices[i]);
		}
	}

	public void ShowAll() {
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + ": " + price.get(i));
		}
	}

	public void FoodAdd(String str, int num) {
		menu.add(str);
		price.add(num);
	}

	public void FoodSet(String str1, String str2) {
		int position = menu.indexOf(str1);
		menu.set(position, str2);
	}

	public void FoodDel(String str) {
		int position = menu.indexOf(str);
		menu.remove(position);
	}

}