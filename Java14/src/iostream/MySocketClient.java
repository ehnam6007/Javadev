package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MySocketClient {
	//채팅 프로그램 생성
	public static void main(String[] args) {
		// 네트워크를 통해 메시지를 주고 받을 때 Socket을 사용
		//Client1 <-> SVR <-> Client2
		MyClient user = new MyClient();
		user.start();	//Thread의 start()메소드 실행
		
	}
}

class MyClient extends Thread{
	Socket socket;
	InputStream is;				//서버의 메세지 받을 때
	OutputStream os;			//서버에 메시지 보낼 때
	ObjectInputStream ois;		// Input object Mapping
	ObjectOutputStream oos;		// Output object Mapping
	
	
	//임시 입력용 Scanner
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		//해당 컴퓨터와 연결(IP, Port)
		try {
			socket = new Socket("localhost",8089);		//socket 생성(이제부터 통신 가능)
			os = socket.getOutputStream();
			is = socket.getInputStream();
			oos = new ObjectOutputStream(os);	// 보낼 준비 완료
			ois = new ObjectInputStream(is);	// 받을 준비 완료
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			//주고 받고 무한반복
			sendMsg();		// 버튼
			revMsg();		// 무한반복
		}
		
	}
	
	//서버로 메시지를 보내는 함수
	public void sendMsg() {
		System.out.println("보낼 메시지:");
		String msg = sc.nextLine();
		try {
			oos.writeObject(msg);
			oos.flush();	//버그방지, 보내고 나서 쓰레기 값이 남아 있을 수도 있기 때문에 비움.	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//서버가 보내온 메시지를 받는 함수.
	public void revMsg() {
		String msg = "";
		try {
			msg = (String) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		// 서버로 부터 메시지를 받는다.
		System.out.println(msg);	// 임시용 출력
	}
}


