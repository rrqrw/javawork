package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn= null;
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기- getConnection(url,user, password)
			 conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) { // 연결이 되어 있다면 
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}//main끝

}
