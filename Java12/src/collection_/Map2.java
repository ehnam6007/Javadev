package collection_;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyDictionary md = new MyDictionary();

		int choice = 0;

		while (true) {

			System.out.println("== 영어사전 ==");
			System.out.println("1.전체조회  2.추가  3.변경  4.삭제  0.종료");
			choice = sc.nextInt();

			if (choice == 1) {
				md.All_Dic();
			} else if (choice == 2) {
				System.out.println("추가할 영단어를 입력하시오");
				String input_eng = sc.next();
				System.out.println("영단어의 뜻을 입력하시오");
				String input_kor = sc.next();
				md.Add_Dic(input_eng, input_kor);

			} else if (choice == 3) {
				System.out.println("변경할 영단어를 입력하시오");
				String input_eng = sc.next();
				System.out.println("영단어의 뜻을 입력하시오");
				String input_kor = sc.next();
				md.Set_Dic(input_eng, input_kor);
				md.All_Dic();

			} else if (choice == 4) {
				System.out.println("삭제할 영단어 또는 한국어를 입력하시오");
				String input = sc.next();
				md.Del_dic(input);
			} else {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;

			}
		}

	}

}

//한영사전 만들기
//생성자에 단어 3개정도 만들기
class MyDictionary {
	// put, get, remove
	HashMap<String, String> Hmap = new HashMap<>();

	public MyDictionary() {
		Hmap.put("flower", "꽃");
		Hmap.put("Sea", "바다");
		Hmap.put("new", "새로운");
	}

	public void All_Dic() {
		Set<String> set = Hmap.keySet();
		for (String temp : set) {
			System.out.print(temp + " : ");
			System.out.println(Hmap.get(temp));

		}

	}

	public void Add_Dic(String eng, String kor) {
		Hmap.put(eng, kor);

	}

	public void Set_Dic(String eng, String chg_kor) {
		Set<String> set = Hmap.keySet();
		for (String temp : set) {
			if(temp==eng) {
				Hmap.remove(eng);
				Hmap.put(eng, chg_kor);
			}
		}
		

	}

	public void Del_dic(String input) {
		boolean p1 = Hmap.containsKey(input);
		boolean p2 = Hmap.containsValue(input);

		System.out.println(input);
		System.out.println(p1);
		System.out.println(p2);
		Hmap.remove(input);

	}

}
