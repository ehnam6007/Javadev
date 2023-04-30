package collection_;

import java.util.Scanner;
import java.util.TreeSet;

public class Set2 {
	public static void main(String[] args) {
		NationSet ns = new NationSet(); // 클래스 객체화
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		String nation;

		while (true) {
			System.out.println("== 국가 이름 저장 프로그램 ==");
			System.out.println("1.추가  2.전체조회  3.변경  4.삭제  0.종료");
			choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {
				System.out.println("추가할 국가명 입력");
				nation = sc.nextLine();
				ns.addNation(nation);
			} else if (choice == 2) {
				ns.ShowAll();

			} else if (choice == 3) {
				System.out.println("삭제할 국가명 입력");
				String bf_str = sc.nextLine();
				System.out.println("변경할 국가명 입력");
				String af_str = sc.nextLine();
				ns.SetNation(bf_str, af_str);

			} else if (choice == 4) {
				System.out.println("삭제할 국가명 입력");
				String rm_str = sc.nextLine();
				ns.DelNation(rm_str);

			} else {
				sc.close();
				break;
			}
		}

	}

}

//국가이름을 보관하는 프로그램, 중복값이 없어야 한다.
class NationSet {
	TreeSet<String> ts = new TreeSet<>();

	public NationSet() {
		ts.add("한국");
		ts.add("미국");
		ts.add("중국");
		ts.add("일본");
	}

	public void ShowAll() {
		for (String e : ts) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println();
	}

	public void addNation(String a_nation) {
		ts.add(a_nation);
	}
	public void SetNation(String bf, String af) {
		ts.remove(bf);
		ts.add(af);
		
	}
	public void DelNation(String a_nation) {
		ts.remove(a_nation);
		
	}

}