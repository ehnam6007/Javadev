package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		// File 클래스를 통해서 파일을 읽고 쓰기
		// Stream : input == 내 프로그램으로 들어온다, output == 내 프로그램에서 내보낸다.
		controlFile cf = new controlFile();
		//cf.readFile("D:\\EhsDevelopment\\eGov\\log\\log01.txt");
		cf.createFile("D:\\EhsDevelopment\\eGov\\log\\");
	}

}

class controlFile {
	// ReadFile()
	Scanner sc = new Scanner(System.in);
	
	public void readFile(String path) {
		FileInputStream fis = null; // file에 있는 데이터를 내 프로그램으로 가져옴
		// null을 넣는 이유는 try-catch 때문, 객체화 선 진행 후 클래스 선언

		try {
			// 파일에 있는 데이터를 일어 (1바이트 단위로)
			fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 일기 실패..");
		} catch (Exception e) {
			System.out.println("변환 실패");

		} finally {
		}
		// finally는 try를 실행하건 catch를 실행하건 무조건 마무리 작업
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// MakeFile
	public void createFile(String path) {
		System.out.println("파일 이름을 입력하세요 >>");
		String filename = sc.next();
		String filepath = path+filename+".txt";
		File file = new File(filepath);
		
		//해당 파일이 이미 있다면 만들지 않는다.
		try {
			if(file.exists()) {
				System.out.println("이미 존재하는 파일입니다.");
				return;
			}
			file.createNewFile();
			System.out.println(filename + "파일을 생성했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
