package iostream;

import java.io.File;

public class Stream1 {
	public static void main(String[] args) {
		//stream : 강, 대량의 데이터를 주고받는 행위를 강으로 표현함.
		FileFound ff = new FileFound();
		ff.go("D:\\EhsDevelopment\\eGov");		//문자열 안에서 역슬래시(\)를 사용하기 위해선\\로 입력
											//문자열 안에서 쌍따옴표(")를 사용하기 위해선 \"로 입력
		
	}

}

//해당 경로에 있는 모든 파일의 이름을 가져오는 클래스
class FileFound{
	public void go(String path) {
		System.out.println(path+"안에 있는 파일을 검색");
		
		//File 클래스 이용
		File file = new File(path);		//해당 경로안에 모든 파일명이 배열형태로 저장
		for(String name : file.list()) {
			System.out.println("파일: "+name);
			
		}
	}
}
