package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//public class EmployeeRepositoryImpl implements EmployeeRepository {
	

	@Override
	/*public List<Employee> findAll() throws ClassNotFoundException, SQLException {
		Connection con=JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs= stmt.executeQuery("Select * from employee order by ename");
		List<Employee> empList = new ArrayList<Employee>();
		while(rs.next()) {
			Employee emp =new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("ename"));
			emp.setSal(rs.getDouble("sal"));
			empList.add(emp);
			
		}
		
		return empList;
	}

	@Override
	public Employee findById(int empid) throws SQLException, ClassNotFoundException {
		Connection con=JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs= stmt.executeQuery("Select * from employee where empId="+empid);
        Employee emp=new Employee();
        if(rs!=null)
        	rs.next();
        emp.setEmpId(rs.getInt("empId"));
        emp.setEmpName(rs.getString("ename"));
        emp.setSal(rs.getDouble("sal"));
        
		// TODO Auto-generated method stub
		return emp;
	}
	
	public Employee findByEname(String ename) throws SQLException, ClassNotFoundException {
		Connection con=JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs= stmt.executeQuery("Select * from employee where ename='"+ename+"'");
        Employee emp=new Employee();
        if(rs!=null)
        	rs.next();
        emp.setEmpId(rs.getInt("empId"));
        emp.setEmpName(rs.getString("ename"));
        emp.setSal(rs.getDouble("sal"));
        
		// TODO Auto-generated method stub
		return emp;
	}
	

	@Override
	public boolean saveEmployee(Employee emp ) throws SQLException, ClassNotFoundException {
		Connection con=null;
		int i=0 ;
		try {
			
		// TODO Auto-generated method stub
			 con=JDBCUtil.getConnection();
		con.setAutoCommit(false);
		String sql="insert employee (empId, ename, sal) values (?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1,emp.getEmpId());
		stmt.setString(2,emp.getEmpName());
		stmt.setDouble(3,emp.getSal());

		 i=stmt.executeUpdate();
		
		con.commit();
		
		// TODO Auto-generated method stub
		}
		catch ( Exception ex)
		{
			con.rollback();
			
		}
		return i>0;
		
	}

	@Override
	public boolean updateEmployee(Employee emp) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
				Connection  con=JDBCUtil.getConnection();
			String sql="update employee set ename=?, sal=? where empId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
		
			stmt.setString(1,emp.getEmpName());
			stmt.setDouble(2,emp.getSal());
			stmt.setInt(3,emp.getEmpId());

			 int i=stmt.executeUpdate();
			
			// TODO Auto-generated method stub
			return i>0;
			
	}

	@Override
	public boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method
		Connection con=JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
	int i= stmt.executeUpdate("delete from employee where empId="+empId);
	return i>0;
	}

	@Override
	public boolean saveEmployee() throws SQLException, ClassNotFoundException {
	
		Connection con=JDBCUtil.getConnection();
		Statement stmt = con.createStatement();
		String sql="insert employee (empId, ename, sal) values (022, 'doe', 1399800)";
		int i=stmt.executeUpdate(sql);
		// TODO Auto-generated method stub
		return i>0;
}

}*/
