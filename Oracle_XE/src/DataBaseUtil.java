import java.sql.*;
import oracle.jdbc.*;
import oracle.sql.*;
/**
 *
 * @author Markus
 * Database Access with Oracle und JDBC
 */
public class DataBaseUtil {
	
	public static ResultSet executeSelect(Connection conn, String sql) {
		ResultSet res = null;
		
		try {
			Statement stm = conn.createStatement();
			res = stm.executeQuery(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static int execute(Connection conn, String sql) {
		int res = 0;
		
		try {
			Statement stm = conn.createStatement();
			boolean st = stm.execute(sql);
			res = stm.getUpdateCount();
		} catch(SQLException e) {
			e.printStackTrace();
			res = -1;
		}
		return res;
	}
	
public static Connection makeOracleConnection(String server, String port, String serviceName, String user, String password)
{
	Connection conn = null;
	
	try{
		DriverManager.registerDriver ( new oracle.jdbc.driver.OracleDriver());

//Verbindung herstellen
		String str = "jdbc:oracle:thin:@" + server + ":" + port + ":" + serviceName;
		conn = DriverManager.getConnection(str,user,password);
}  catch(SQLException e) {
	e.printStackTrace();
}
	return conn;


}

public static void main(String[] args)
{
Connection conn = DataBaseUtil.makeOracleConnection("127.0.0.1","1521","","test","test");
if(conn==null)
	System.out.println("Verbindungsaufbau fehlgeschlagen");
else
	System.out.println("Oracle Verbindung steht");
try {
	PreparedStatement ps = conn.prepareStatement("select * from emp where JOB = ? and DEPTNO = ? ");
ps.setString(1, "MANAGER_n");
ps.setString(2, "20");
ResultSet rs = ps.executeQuery();
System.out.println(rs.getString(1) + rs.getString(2));
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//DataBaseUtil.execute(conn, "UPDATE emp SET job ='MANAGER_n'  WHERE empno = 7876");
//conn.close();
//Statement stmt = conn.createStatement();
//conn.setAutoCommit(false);
//int n =stmt.executeUpdate(
//		"UDATE emp SET job ='MANAGER_test'  WHERE empno = 7876");
//conn.commit();
////rs.close();
//stmt.close();

		
		
} 
//conn.close();

}