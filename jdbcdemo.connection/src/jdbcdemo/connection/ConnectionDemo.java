package jdbcdemo.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433" 
					+ ";databaseName=DemoLab","sa","manager");
			System.out.println("connection success");
			Thread.sleep(10000);
			
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if(conn != null) {
					if(!conn.isClosed()) {
						conn.close();
						System.out.println("連線已關閉");
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
