package Inter;

public class Review2 extends Review1 {
	
	//Review1의 코드 복붙 되었음
	
	//상속을 했더니 클래스명에 빨간밑줄이 간다? 명시해줘야하는 메서드가 있는 것(생성자)
	//빨간밑줄에 마우스를 갖다대고 첫번째 파란색 항목 클릭
	public Review2(int num1, int num2, int num3, int num4) {
		super(num1, num2, num3, num4);
		super.num4 =4;
		
		//super. : 부모의 변수 또는 메서드를 사용
		//this. : 나(클래스)의 변수 또는 메서드 사용
		
	}
	
	//상속(복붙)을 하는 이유는 '기존 클래스를 유지한채로 기능을 수정/추가 하기 위해서'
	//수정(오버라이딩) 
	@Override
	public void printNum() {
		//super.printNum();	 : 부모의 printNum을 사용(코드 실행)
		System.out.println("결과"+(num2+num3));
	}
	//추가
	private String str = "자식 클래스";
	public void printStr() {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Review2 review2 = new Review2(0,1,2,3);
		review2.printNum();
	}
}
