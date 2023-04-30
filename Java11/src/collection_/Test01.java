package collection_;

import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		ArrayList<String> menu = new ArrayList<>();
		ArrayList<Integer> price = new ArrayList<>();

		String menus[] = { "김밥", "떢볶이", "순대" };
		int prices[] = { 1000, 2000, 3000 };

		//menu.addAll(Arrays.asList(menus));
		for (int i = 0; i < prices.length; i++) {
			menu.add(menus[i]);
			price.add(prices[i]);
			System.out.println(menu.get(i) + ": " + price.get(i));

		}
	}
}