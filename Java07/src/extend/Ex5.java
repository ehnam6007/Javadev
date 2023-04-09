package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr ms = new MyStr("Hello Wolrd");
		ms.printstr();
		
		MyStrEx mx = new MyStrEx("Welcome to Java World");
		mx.printstr();
	}

}
class MyStr{
	protected String str;
	
	public MyStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void printstr() {
		System.out.println(str);
	}
	
}
// MyStr 클래스를 상속받고 출력이 좀더 꾸며진채로 출력될 수 있게 변경
class MyStrEx extends MyStr{

	public MyStrEx(String str) {
		super(str); //부모 생성자에 매개변수가 있으면(기본 생성자 없으면) 자식 생성자에서 사용을 해줘야함
	}
	public void printstr() {
		System.out.println("== "+str+" ==");
	}
}