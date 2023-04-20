package JDBCProjectHome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		
		try {

			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "Hr", "tiger");
			
			if (conn != null) {
					System.out.println("데이터베이스 연결!");
					conn.close(); // 자원의 반납
			}

			} catch (SQLException e) {
				e.printStackTrace();
			
			} 


	
	}
}
