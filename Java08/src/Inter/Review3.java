package Inter;

public interface Review3 {
	//상속용 클래스
	//인터페이스 : 상수 또는 메서드의 선언부만 올 수 있음.
	
	final static String str="Review3 Interface";	//상수 : final 한번 정하면 못바꿈
	String str2 = "final static이 생략되어있음";	//자료형 앞에 final static이 자동 생략되어 있음.(인터페이스에서만 그렇게 적용)
	
	public void test1();	//{}없이 선언까지만
	public void test2();	//상속받은 곳에서 반드시 오버라이딩으로 {}를 구현해줘야함.
	

}
