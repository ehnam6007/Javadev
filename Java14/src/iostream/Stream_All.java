package iostream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Stream_All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileMgmt fm = new FileMgmt();
		
		fm.SVpath();

		while (true) {
			System.out.println("원하는 작업을 선택하시오. 1.파일목록 2.파일생성 3.파일삭제 4.내용확인 5.내용입력 0.종료");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else if (num == 1) fm.RDfile();
			else if (num ==2) fm.MKfile();
			else if (num==3) fm.DELfile();
			else if(num==4) fm.IPfile();
			else if(num==5) fm.OPfile();
			else System.out.println("잘못 입력하셨습니다!");
			
		}

	}

}

class FileMgmt {
	Scanner sc = new Scanner(System.in);
	String str;

	//경로 저장
	public void SVpath() {
		System.out.println("경로를 입력하시오.");
		String str = sc.next();
		this.str = str;
	}
	//파일읽기
	public void RDfile() {
		File file = new File(str);
		System.out.println(str + " 경로의 파일 목록");
		for (String name : file.list()) {
			System.out.println(name);
		}
		System.out.println();
	}
	//파일생성
	public void MKfile() {
		
		System.out.println("생성할 파일 명을 입력하시오");
		String f_name = sc.next();
		String f_path =  this.str +"\\"+f_name;
		File file = new File(f_path);
		
		try {
			if(file.exists()) {
				System.out.println("이미 존재하는 파일입니다.");
				return;
			}
			file.createNewFile();
			System.out.println("파일 생성을 완료했습니다.");
			RDfile();
		} catch (IOException e) {e.printStackTrace();}

	}
	//파일삭제
	public void DELfile() {
		
		System.out.println("삭제할 파일 명을 입력하시오");
		String f_name = sc.next();
		String f_path =  this.str +"\\"+f_name;
		File file = new File(f_path);
		
		boolean result = file.delete();
		if(result) {
			System.out.println("삭제 성공!");
		}else System.out.println("삭제 실패..");
		RDfile();
	}
	//내용입력
	public void IPfile() {

	}
	//내용출력
	public void OPfile() {
		
	}
}