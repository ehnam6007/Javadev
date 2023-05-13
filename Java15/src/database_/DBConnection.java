package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args) {
		// DB와 연결이 정상적으로 진행된느지 테스트하는 코드

		// 자바에서 'DB' 프로그램을 사용하는 방법(JDBC Java Database Connectivity)
		// 1. DB 서버를 설치한다.
		// 2. Connector 라이브러리를 설치한다. (DB마다 다름)
		// 3. 프로젝트에 추가한다.(프로젝트 속성 > Java Build Path > Libraries > Add External Jar.. >
		// .jar library file 추가
		
		SQLConnector sql = new SQLConnector();
		
		// 자료구조 알고리즘 멀티쓰레드 DB 네트워크(소켓)
		

	}

}

class SQLConnector {
	private Connection conn;
	private static final String DBID = "root"; // final이 들어가면 변수가 상수화됨. 변경 불가
	private static final String DBPW = "maria1!"; // static은 고정변수, 모든 곳에서 직접 활용 가능, 우선순위 높음
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";

	// 생성자
	public SQLConnector() { // 생성자 사용
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("라이브러리 로드 성공!");
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		} 

	}
}
///https://downloads.mariadb.com/Connectors/java/connector-java-3.0.10/