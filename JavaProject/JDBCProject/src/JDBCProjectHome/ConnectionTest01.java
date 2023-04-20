package JDBCProjectHome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest01 {

	public static void main(String[] args) {

		try {
			String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection con 
			= DriverManager.getConnection(dbUrl,"Hr","tiger");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
				
		
	}

}
