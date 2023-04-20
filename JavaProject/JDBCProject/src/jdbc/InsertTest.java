package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {

			//Oracle 연결
		
		try {
//			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임")
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			// 2. Connection 객체를 생성 : 연결 정보
//			// jdbcUrl
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
//-----------------------------------------------------------------------------------
		
			// Mysql 연결
			
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
//			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "admin");
			
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			
			// insert Sql
			String sql = "insert into dept values ( ? , ?, ? )";
			//String sql = "insert into dept ("+no+", '"+name+"', '"+loc+"')";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발팀");
			pstmt.setString(3, "SEOUL");
			
			int result = pstmt.executeUpdate(); // 처리된 개수 값 뽑아내기
			
			// 처리된 개수 반환값이 1이상이면 메세지 출력
			if(result>0) {
				System.out.println("데이터가 입력되었습니다");
			}
			
			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			
			// 5. ResultSet 객체에서 데이터 추출
			
			pstmt.close();
			conn.close();
			
		
			} catch (SQLException e) {
				e.printStackTrace();
			
			} 
//		catch (ClassNotFoundException e) {
//				e.printStackTrace();
//		}


	
	}
}
