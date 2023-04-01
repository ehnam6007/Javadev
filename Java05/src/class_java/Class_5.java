package class_java;

public class Class_5 {
	public static void main(String[] args) {
		MyClass5 mc5 = new MyClass5();
		mc5.method1();
		System.out.println("끼어들기");
		mc5.method1();
		mc5.method2("Hello ", "World");
		//반환값이 있으면 변수로 담는 형태로 사용한다.
		//메서드3이 String으로 반환해주기 때문에
		String result3 = mc5.Method3();
		System.out.println("메서드3의 반환값은 : "+result3);		
		//메서드4의 결과값
		int result4 = mc5.Method4(3.7);
		System.out.println("결과는 : "+result4);
		System.out.println("결과는 : "+mc5.Method4(4.7));
	}
}

class MyClass5 {
	// 메서드1 : 반환값x, 입력값x (오로지 코드 저장, 가독성)
	void method1() {
		// 입력값이 없으면()를 비워놓겠습니다.
		// 반환값이 없으면 자료형은 void로 하고 return은 생략
		// return;

		// 오로지 코드 재사용
		int num = 1;
		System.out.println("나는 메스드" + num + "에 저장된 코드다");
	}
	//메서드2 : 반환값x, 입력값o(코드 재활용, 일부만 변수인 경우)
	void method2(String str1,String str2)
	{
		//입력값이 있으면 입력받고자 하는 값의 변수들을 생성해 놓는다
		//반환값이 없으면 자료형은 void, return은 생략
		System.out.println("소괄호로 넘어오는 값만 변경 : "+str1+str2);
	}
	//메서드3 : 반환값o, 입력값x (코드 재사용, 메서드 사용 후에 마지막으로 전달해줄 값이 있음)
	String Method3() {
		String result = "반갑습니다";
		System.out.println("메서드 3을 사용!");
		return result;	//코드 마지막에 return 옆에 있는 값을 전달
	}
	//메서드4 : 반환값o , 입력값o 
	int Method4(double dnum){
		//입력값이 있으면 ()를 변수로 채워놓고, 반환값이 있으면 return을 사용하고 맨 앞의 자료형을 맞춰준다.
		System.out.print("실수형 자료형을 반올림 합니다. ");
		double result = dnum -(int)dnum;
		if(result>=0.5) {
			dnum+=1.0;
		}
		return (int)dnum;
		
	}
}
