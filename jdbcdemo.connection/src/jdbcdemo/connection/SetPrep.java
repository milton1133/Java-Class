package jdbcdemo.connection;

import java.sql.Driver;


public class SetPrep {
	public static void main(String[] args) {
		System.setProperty("jdbc.drivers", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
	}
	
	
}
