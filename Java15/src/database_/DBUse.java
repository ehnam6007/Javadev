package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUse {
	public static void main(String[] args) {
		MYQuery mq = new MYQuery();
		//mq.insert();
		//mq.update();
		//mq.delete();
		/*
		mq.connect();
		mq.selectALL();
		mq.disconnect();	*/
	
		mq.connect();
		mq.selectALL();
		System.out.println("====================");
		mq.insert();	//추가
		mq.update();	//변경
		mq.selectALL();
		mq.disconnect();
	
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
	
	//DB 조회 : SELECT
	public void selectALL() {
		PreparedStatement pstmt = null;
		String sql_query = "SELECT * FROM company.employee"; 

		ResultSet rs = null;
		ArrayList<Integer> no = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> gender = new ArrayList<>();
		
		try {
			//1. pstmt에다가 sql_query 넣기
			pstmt = conn.prepareStatement(sql_query);

			//2. ? 채워넣기 (생략)
			
			//3. sql 쿼리 전송하고 그 결과를 변수에 담는다.
			rs = pstmt.executeQuery();
			
			//4. 적절하게 배치
			while(rs.next()) {
				no.add(rs.getInt(1));
				name.add(rs.getString("name"));
				gender.add(rs.getString("gender"));	
			}
			
			//출력테스트
			for(int i=0;i<no.size();i++) {
				System.out.println(no.get(i)+","+name.get(i)+","+gender.get(i));
			}
			
			//5. 정리
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}		
	}
	
	// DB입력 : INSERT INTO 테이블명 VALUSES 값;
	public void insert() {
		PreparedStatement pstmt = null;
		String sql_query = "INSERT INTO company.employee VALUES(?,?,?)"; //사용자가 입력하는 값은 ?로 표시함.
		
		//pstmt에다가 sql query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
			pstmt.setInt(1, 4);							
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}			//insert()
	//DB수정(UPDATE 테이블명 SET 내용)
	
	public void update() {
		PreparedStatement pstmt = null;
		String sql_query = "UPDATE company.employee SET gender=? WHERE name=?";
	
		//1. pstmt에다가 sql 문자열을 담는다.
		try {
		
			pstmt = conn.prepareStatement(sql_query);
			//2. pstmt의 ?를 채워넣는다.
			pstmt.setString(1, "여자");
			pstmt.setString(2, "아무개");
			
			//3. DB로 전송한다.
			int result = pstmt.executeUpdate();
			
			//4. 결과를 확인한다.
			if(result > 0) {
				System.out.println("업데이트 성공");
			}else System.out.println("업데이트 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. 더이상 사용하지 않을 자원은 정리한다.
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
	}
	//DB삭제 (DELETE FROM 테이블명 WHERE 조건)
	public void delete() {
		PreparedStatement pstmt = null;
		String sql_query = "DELETE FROM company.employee WHERE name=?";
	
		//1. pstmt에다가 sql 문자열을 담는다.
		try {
		
			pstmt = conn.prepareStatement(sql_query);
			//2. pstmt의 ?를 채워넣는다.
			pstmt.setString(1, "아무개");
			
			//3. DB로 전송한다.
			int result = pstmt.executeUpdate();
			
			//4. 결과를 확인한다.
			if(result > 0) {
				System.out.println("삭제 성공");
			}else System.out.println("삭제 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. 더이상 사용하지 않을 자원은 정리한다.
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
	}
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


















