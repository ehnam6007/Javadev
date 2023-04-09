package Inter;

public class Review4 implements Review3 {
	// 인터페이스를 받으면 클래스명에 빨간줄이 생성됨
	// 클래스명 밑의 빨간줄에 마우스를 갖다대고 첫번째 파란 항목을 클릭

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(str);

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("재정의");
	}
	
	public static void main(String[] args) {
		Review4 review4 = new Review4();
				
		System.out.println(str2);	//static은 바로 쓸 수 있으나 많이 사용하면 메모리 부하로 성능 저하 발생
		review4.test1();
		review4.test2();
	}
}

//extends class : class 하나만 상속 가능
//implements class1 class2 class3 : class 여러개 상속 가능