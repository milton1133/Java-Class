package module_1;

import java.sql.Connection;

import module_1.connectUtil.ConnectionUtil;

public class Test {
	public static void main(String[] args) {
		try {
			ConnectionUtil connUtil = new ConnectionUtil();
			Connection conn = connUtil.getConnection();
			System.out.println("連線成功");
			System.out.println("連線是否關閉" + conn.isClosed());
			conn.close();
			System.out.println("連線失敗");
			System.out.println("連線是否關閉" + conn.isClosed());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
