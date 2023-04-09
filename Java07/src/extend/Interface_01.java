package extend;

public interface Interface_01 {
	//interface : static 상수 + 추상메서드
	//인터페이스는 상속전용임. 다형성, 명세서 개념임
	
	//상수 : 초기화할 때 값을 정해놓으면 변경이 불가능한 변수
	int num=0; //파랑 ; static, 기울여짐 꼴 : final 선언 생략  (final static) int num=0;
	final String str = "hello"; //상수(값이 고정된 저장공간) final 상수는 한번 값을 정하면 바꿀 수 없다.
	//str="hi";	
	//추상메스드 : ()까지만 적는다. {}는 적지 않는다., 
	public void func(); 	//함수 선안만 함.(정의하지 않음)
	
	//상속받는 곳에서 이 기능을 정할거야.
	//받느시 만들어야할 메서드를 안내(명세서)
	
}
//인터페이스를 상속(지정)받으려면 extends가 아니라 implements라고 작성
class Test implements Interface_01{

	@Override
	public void func() {
		//반드시 만들어야한다!(필수사항)
		// TODO Auto-generated method stub
		
	}
	//인터페이스를 지정하는 순간 클래스명에 오류가 발생
	//마우스를 갖다대고 'Add unimplemented methods'를 클릭
	//메서드 완성
}
