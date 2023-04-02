package review;

public class Review {
	public static void main(String[] args) {
		MyModel md1 = new MyModel();
		MyModel md2 = new MyModel();	//class가 같아도 객체가 다르면(md1, md2) 값이 달라진다.(다른 공간에 저장됨)

		md1.set_string("안녕"); // md1.str = "안녕";
		md2.set_string("반갑"); // md2.str = "반갑";

		System.out.println(md1.get_string());
		System.out.println(md2.get_string());
		
		MyView mv = new MyView();
		mv.printStr(md1);
		mv.printStr(md2);
		
		mv.printNum(md1);
		mv.printNum(md2);

	}

}

class MyModel {
	// 멤버변수
	int num;
	String str;

	// 메서드
	void set_num(int num) {
		this.num = num;
	}

	int get_num(/* 매개변수 */) {
		/* 지역변수 */
		return num; // 이름이 중복되는 매개변수나 지역변수가 없으면 this.은 생략 가능
	}

	void set_string(String str) {
		this.str = str;
	}

	String get_string() {
		return str;
	}

}
// 출력용 (화면, 소리, 등...)
class MyView{
	void printNum(MyModel md1) {
		System.out.println(md1.num);
	}
	void printStr(MyModel md2) {
		System.out.println(md2.str);
	}
	
}