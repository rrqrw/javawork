package dbcrud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class BoardUpdateTest {

	public static void main(String[] args) {
		Connection conn= null;   //네트워크 연결 클래스 
		PreparedStatement pstmt = null; // sql 처리 인터페이스 
		try {
			//JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기- getConnection(url,user, password)
			 conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			
			//db처리작업
			//매개변수화된 sql문 작성  - 동적 바인딩 
			String sql = "update boards "
					+ "    set btitle=?, bcontent=?, bfilename=? , bfiledata=? "
					+ " where bno= ?";
			pstmt = conn.prepareStatement(sql);
			// ?값지정
			pstmt.setString(1, "노트북");
			pstmt.setString(2, "LG 노트북입니다");
			pstmt.setString(3, "notebook.PNG");
			//사진 첨부한 경우 
			
			pstmt.setBlob(4, new FileInputStream("src/dbcrud/notebook.PNG"));
			pstmt.setInt(5, 21);
			// 사진 미첨부인 경우
			/*pstmt.setString(4, null);
			Blob blob = null;
			pstmt.setBlob(5, blob);*/
			
			
			int rows = 	pstmt.executeUpdate();
			System.out.println("저장된 행의 수: "+ rows);
			//auto  commit이됨
			
				
			
			} catch (Exception e) {
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


	}

}
