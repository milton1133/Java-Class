package module_1.connectUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	Connection conn;
	String url = "jdbc:sqlserver://localhost:1433;databaseName=DemoLab";
	String user = "sa";
	String password = "manager";
	
	public ConnectionUtil(){
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("連線發生問題");
		}
		
		
	}
	
	public Connection getConnection() {
		return conn;
	}
}
