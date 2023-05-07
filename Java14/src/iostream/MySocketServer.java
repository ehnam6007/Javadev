package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MySocketServer {
	public static void main(String[] args) {
		MyServer server = new MyServer();
		server.start();
	}

}

class MyServer extends Thread {
	// 서버소켓은 내 컴퓨터의 ip를 자동으로 가져옴
	// Port는 정해줘야함.
	ServerSocket serverSocket; // 서버를 시작하기 위한 소켓(접속용)
	Socket socket; // 각 소켓을 관리하기 위한 소캣(개개인별)

	// 사용자의 정보와 IP를 저장할 수 있는 Map
	HashMap<String, String> client = new HashMap<>();

	public void run() {
		try {
			// 소켓 오픈(서버 시작)
			serverSocket = new ServerSocket(8089);
			while (true) {
				System.out.println("서버 시작 - 요청 대기");
				socket = serverSocket.accept(); // client의 접속을 대기하고 들어오면 socket에 옮김
				System.out.println("접속한 클라이언트 : " + socket.getInetAddress());

				String ClientIP = socket.getInetAddress().toString();
				// MyServer : 접속용 쓰레드, ClientHandleer : 통신용 쓰레드
				ClientHandler client = new ClientHandler(socket);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class ClientHandler extends Thread {
	InputStream is;
	OutputStream os;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;

	public ClientHandler(Socket socket) {
		this.socket = socket;
	}

	public void run() {

			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				
				while(true) {
					String msg;
					try {
						msg = (String)ois.readObject();
						System.out.println("클라이언트의 메시지 : "+msg);
						oos.writeObject("서버로부터 되돌아온 메시지 : "+msg);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
				} 
			}catch (IOException e) {
				e.printStackTrace();
			}
			
	}
		
}


	
			
		
