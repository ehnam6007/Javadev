package polymorphism;

import java.util.Scanner;

public class Poly_pet2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = -1, type = -1;
		Pet pet_list[] = new Pet[60];
		int pet_count = 0;

		while (select != 0) {
			System.out.println("===menu===");
			System.out.println("1.추가 2.울기 3.먹기 0.종료");
			select = Integer.parseInt(sc.nextLine()); // 메뉴선택 문자열 → Integer

			if (select == 1) {
				System.out.println("0:강아지, 1:고양이 ?");
				type = Integer.parseInt(sc.nextLine()); // 추가항목 선택
				if (type == 0) {
					pet_list[pet_count++] = new Dog2();
					System.out.println("강아지를 추가했습니다.");
					// 강아지
				} else if (type == 1) {
					pet_list[pet_count++] = new Cat2();
					System.out.println("고양이를 추가했습니다.");
					// 고양이
				} else
					System.out.println("선택지에 없는 입력값입니다.");
			} else if (select == 2) {
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].cry();
				}
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].cry();
				}
			} else if (select == 3) {
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].eat();
				}
				for (int i = 0; i < pet_count; ++i) {
					pet_list[i].eat();
				}

			} else if (select != 0) {
				System.out.println("선택지에 없는 입력값입니다.");
			}

		}
	}
}

class Cat2 implements Pet {

	public void cry() {
		System.out.println("야옹");
	}

	public void eat() {
		System.out.println("츄르");
	}
}

class Dog2 implements Pet {

	public void cry() {
		System.out.println("멍멍");
	}

	public void eat() {
		System.out.println("개껌");
	}
}
