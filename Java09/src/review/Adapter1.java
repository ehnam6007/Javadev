package review;

public abstract class Adapter1 implements interface1{
	public void must1() {
		System.out.println("어댑터에서 미리 구현해서 저장!");
	}
	//인터페이스처럼 추상메서드 제공 가능(메서드 선언만)
	public abstract void must3();
	
	// 클래스처럼 구현도 가능
	public String have() {
		return "Hello";
	}

}
