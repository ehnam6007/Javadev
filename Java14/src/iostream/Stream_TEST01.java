package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream_TEST01 {
	public static void main(String[] args) {
		String f_path = "D:\\EhsDevelopment\\eGov\\log\\";
		myfile mf = new myfile();
		//mf.ReadFile(f_path+"log01.txt");
		//mf.CreateFile(f_path);
		//mf.putFile(f_path+"log02.txt");
		mf.deleteFile(f_path+"log02.txt");
	}

}

class myfile {
	Scanner sc = new Scanner(System.in);

	// ReadFile
	public void ReadFile(String path) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패..");
		} catch (Exception e) {
			System.out.println("변환 실패");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// CreateFile
	public void CreateFile(String path) {

		System.out.println("파일 이름을 입력하세요");
		String f_name = sc.next();
		String f_path = path + "\\" + f_name + ".txt";

		File file = new File(f_path);

		try {
			if (file.exists()) {
				System.out.println("이미 존재하는 파일입니다.");
				return;
			}
			file.createNewFile();
			System.out.println("파일을 생성했습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Input : 내 프로그램 > 운영체제 프로그램(outputStream)
	public void putFile(String pathfile) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(pathfile,true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("입력할 내용>>");
		String str = sc.nextLine();
		str += "\n"; // 줄바꿈

		// 파일로 옮기기 위해선 byte단위로 바뀌어야함.
		byte[] byteArray = str.getBytes();
		try {
			fos.write(byteArray); // 파일에 쓰기
			System.out.println("입력 성공!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	//delete File
	//파일 경로와 확장자를 입력하면 삭제해줌
	public void deleteFile(String _file) {
		File file = new File(_file);
		boolean result = file.delete();
		if(result) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	

	

}
