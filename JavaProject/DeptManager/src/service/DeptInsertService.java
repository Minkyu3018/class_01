package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {

	DeptDao dao;

	private DeptInsertService() {
		this.dao = DeptDao.getInstance();
	}
	
    private static DeptInsertService service = new DeptInsertService();
	
	public static DeptInsertService getInstance() {
		return service;
	}
	
	
	public int insertDept(Dept dept) throws SQLException {
		
		// RequestDept => dname, loc
		// 데이터 가공		
		// Transaction
		
		Connection conn = null;
		int result = 0;
		
		conn = ConnectionProvider.getConnection();
		result = dao.updateDeptByDeptno(conn, dept);
		
		
		return result;
		//return dao.insertDept(ConnectionProvider.getConnection(), dept);
		
	}
	
	
}
