package JDBCProjectHome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConTest1 {

	public static void main(String[] args) {

		// 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "Hr", "tiger");

			String sql = "select * from dept";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2));
				
						
			}
			
			rs.close();
			pstmt.close();
			conn.close();
					
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("error1");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error2");
		}
		
		
	}

}
