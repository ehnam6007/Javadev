package string;

public class String1 {
	public static void main(String[] args) {

		//quiz1 src변수에서 '길동'만 추출해서 출력
		String src = "홍길동";
		int gil = src.indexOf("길");
		int dong = src.indexOf("동");
		System.out.println(src.substring(gil,dong+1));
		
		//quiz2 src2변수에서 홍길동을 장보고로 바꿔서 출력
		String src2 = "안녕하세요 저는 홍길동 입니다. 올해 23살 입니다.";
		int name_idx = src2.indexOf("홍길동");
		String result1 = src2.replace("홍길동", "장보고");
		System.out.println(result1);
			
		
		/*
		String str = "Hello World";
		boolean result = str.equals("Hello World!");
		System.out.println(result);
		//1. 문자열 일치 여부 확인
		if(str.equals("Hello World!")) {
			System.out.println("같습니다!");
		}else System.out.println("다릅니다.");
		
		//2. 해당 문자열 포함여부 확인
		if(str.contains("Hell")) {
			System.out.println("갖고 있네!");
		}else System.out.println("안 갖고 있네..");
		
		//3. 교체
		String result2 = str.replace("Hello", "Hi");
		System.out.println(result2);
		
		//4. 글자수 알려주기 length()
		System.out.println(str.length());
		
		//5. 글자의 시작 위치를 알려주기 index0f()
		int result3 = str.indexOf("World");		//World의 w위치를 알려줌(배열 형태로)
		System.out.println(result3);
		
		//6. 위치를 알려주면 해당하는 글자를 알려주기 charAt()
		char result4 = str.charAt(1);
		System.out.println(result4);
		
		//7. 잘라내기(추출하기) substring
		result2 = str.substring(1, 5);	//1~4번방을잘라냄
		System.out.println(result2);
		
		//8. 합치기 +
		str = str + "@@";
		System.out.println(str);
		*/
		
	}

}
