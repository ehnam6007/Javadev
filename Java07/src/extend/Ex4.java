package extend;

public class Ex4 {
	public static void main(String[] args) {
		StarBugs cafe1 = new StarBugs("본점", 123);
		cafe1.printMenu();

		StarBugs_bp cafe_bp = new StarBugs_bp("부평", 123);
		cafe_bp.printMenu();
	}

}

class StarBugs {
	protected String braunch;
	protected String menu[] = new String[3];
	protected int result;

	public StarBugs(String braunch, int result) {
		this.braunch = braunch;
		this.result = result;
		setMenu();
	}

	public void setMenu() {
		menu[0] = "카푸치노";
		menu[1] = "카페라떼";
		menu[2] = "오렌지 주스";
	}

	public void printMenu() {
		System.out.println(braunch + "의 메뉴판");
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i] + " ");
		}
		System.out.println();

	}
}

class StarBugs_bp extends StarBugs {

	StarBugs_bp(String braunch, int result) {
		super(braunch, result);
	}
	//오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setMenu() {
		menu[0] = "아메리카노";
		menu[1] = "에스크레소";
		menu[2] = "딸기주스";
	}
		/*
	public void setMenu(String menu1,String menu2,String menu3 ) {
		menu[0] = menu1;
		menu[1] = menu2;
		menu[2] = menu3;
	
	}
*/
}