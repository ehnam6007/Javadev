package review;

import javax.swing.text.html.BlockView;

public class Kr_Controller {
	public static void main(String[] args) {
		KrModel km1 = new KrModel();
		KrModel km2 = new KrModel();


		km1.set_num(2022);
		km2.set_num(2023);
		km1.set_str("안녕하세요");
		km2.set_str("반갑습니다.");

		km1.get_num();
		km2.get_num();
		km1.get_str();
		km2.get_str();

	}

}

class KrModel {
	int num;
	String str;

	void set_num(int num) {
		this.num = num;
	}

	void set_str(String str) {
		this.str = str;
	}

	void get_num() {
		System.out.println(num);
	}

	void get_str() {
		System.out.println(str);

	}
}
class KrView {
	void get_num(KrModel km) {
		System.out.println(km.num);
	}

	void get_str(KrModel km) {
		System.out.println(km.str);

	}
}