package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUse {
	public static void main(String[] args) {
		MYQuery mq = new MYQuery();
		mq.connect();
		mq.insert();
	}

}

class MYQuery{
	// 데이터베이스는 기본적으로 읽기, 쓰기, 수정, 삭제 CRUD로 이루어짐.
	// 프로그래밍 언어에서 DataBase를 사용하기 위해서는 두가지 방법이 있음.
	// Statement : 쉬움, 보안취약점
	// PreparedStatement : 어려움, 보안강화
	private Connection conn;
	private static final String DBID = "root"; // final이 들어가면 변수가 상수화됨. 변경 불가
	private static final String DBPW = "maria1!"; // static은 고정변수, 모든 곳에서 직접 활용 가능, 우선순위 높음
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";
	//mysql을 사용할 경우 : "jdbc.mysql://IP:Port/스키마이름"
	
	// 생성자(라이브러리 로드)
	public MYQuery() { // 생성자 사용
		try {
			Class.forName("org.mariadb.jdbc.Driver");		//mysql을 사용할 경우 : "com.mysql.jdbc.Driver"
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
	// DB연결
	public void connect() {
		try {
			conn = DriverManager.getConnection(DBURL,DBID,DBPW);
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
		
	}
	
	// DB입력 : INSERT INTO 테이블명 VALUSES 값;
	public void insert() {
		PreparedStatement pstmt = null;
		String sql_query = "INSERT INTO company.employee VALUES(?,?,?)"; //사용자가 입력하는 값은 ?로 표시함.
		
		//pstmt에다가 sql query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
			pstmt.setInt(1, 5);							
			pstmt.setString(2,"아무희");				
			pstmt.setString(3, "여자");
			
			//sql 쿼리를 db서버에 전송.
			int result = pstmt.executeUpdate();
			
			//성공여부 판별
			if(result>0) {
				System.out.println("DB 입력 성공!");
			}else {
				System.out.println("DB 입력 실패ㅠㅜ");
			}
		} catch (SQLException e) {
			System.out.println("DB 입력 실패(바깥");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


















