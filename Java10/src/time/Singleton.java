package time;

public class Singleton {
	//	디자인패턴을 싱글턴패턴으로 해서 클래스를 구성(디자인)
	Singleton() {}
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance ==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	//멤버변수와 메서드
	private String str;
	public String GetStr() {return str;}
	public void SetStr(String str) {
		this.str = str;
	}
	
}
