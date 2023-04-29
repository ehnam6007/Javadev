package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Nations {
	public static void main(String[] args) {
		ArrayList4 arr4 = new ArrayList4();
		Scanner sc = new Scanner(System.in);

		String str="";
		String after="";
		int choice =0;

		while (true) {		
			
			System.out.println("==항목을 선택하세요==");
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
			choice = sc.nextInt();
			if (choice == 0) {
				break;
			} else if (choice == 1) {
				System.out.println("추가할 국가명?");
				str = sc.next();
				arr4.AddNation(str);
			} else if (choice == 2) {
				System.out.println("변경할 국가명?");
				str = sc.next();
				System.out.println("변경 후 국가명?");
				after = sc.next();
				arr4.SetNation(str, after);
			} else if (choice == 3) {
				System.out.println("삭제할 국가명?");
				str = sc.next();
				arr4.deleteNation(str);
			} else { 
				System.out.println("전체보기");
				arr4.ShowAll();

			}

		}
	}
}

class ArrayList4 {
	private ArrayList<String> nations = new ArrayList<>();

	public ArrayList4() { // Constructor
		nations.add("한국");
		nations.add("미국");
		nations.add("중국");
		nations.add("일본");
		nations.add("대만");
	}

	public void AddNation(String str) {
		nations.add(str);
	}

	public void SetNation(String prev, String after) {
		int num = nations.indexOf(prev);
		nations.set(num, after);
	}

	public void deleteNation(String str) {
		int num = nations.indexOf(str);
		nations.remove(num);
	}

	public void ShowAll() {
		for (int i = 0; i < nations.size(); i++) {
			System.out.println("[" + i + "] : " + nations.get(i));
		}
	}

}
