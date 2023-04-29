package polymorphism;

import java.util.Scanner;

public class Poly_pet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = -1, type = -1;
		
		Dog dog_list[] = new Dog[20];
		int dog_count = 0;
		Cat cat_list[] = new Cat[20];
		int cat_count = 0;
		//항목을 추가할 때마다 전반적으로 프로그램이 수정됨 ==> 다형성을 사용하여 자료형을 통일하는 틀을 제공하는 방식으로 코드를 짜보자!

		Pet pet_list[]=new Pet[60];
		int pet_count =0;
		
		while (select != 0) {
			System.out.println("==menu===");
			System.out.println("1.추가 2.울기 3.먹기 0.종료");
			select = Integer.parseInt(sc.nextLine()); // 메뉴선택 문자열 → Integer

			if (select == 1) {
				System.out.println("0:강아지, 1:고양이 ?");
				type = Integer.parseInt(sc.nextLine()); // 추가항목 선택
				if (type == 0) {
					dog_list[dog_count++] = new Dog();
					System.out.println("강아지를 추가했습니다.");
					// 강아지
				} else if (type == 1) {
					cat_list[cat_count++] = new Cat();
					System.out.println("고양이를 추가했습니다.");
					// 고양이
				} else
					System.out.println("선택지에 없는 입력값입니다.");
			} else if (select == 2) {
				for (int i = 0; i < dog_count; ++i) {
					dog_list[i].cry();
				}
				for (int i = 0; i < cat_count; ++i) {
					cat_list[i].cry();
				}
			} else if (select == 3) {
				for (int i = 0; i < dog_count; ++i) {
					dog_list[i].eat();
				}
				for (int i = 0; i < cat_count; ++i) {
					cat_list[i].eat();
				}

			} else if (select != 0) {
				System.out.println("선택지에 없는 입력값입니다.");
			}

		}
	}
}

	class Cat implements Pet {

		public void cry() {
			System.out.println("야옹");

		}

		public void eat() {
			System.out.println("츄르");

		}

	}

class Dog implements Pet {

	public void cry() {
		System.out.println("멍멍");

	}

	public void eat() {
		System.out.println("개껌");

	}

}
