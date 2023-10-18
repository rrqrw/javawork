package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample2 {
	
	 private Scanner scanner = new Scanner(System.in);
	 private Connection conn;
	 private PreparedStatement pstmt;
	 
	 
	 // db 연결관련 변수 
	 private String driverClass= "oracle.jdbc.OracleDriver";
	 private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	 private String user = "c##mydb";
	 private String password = "pwmydb";
	
	
	//생성자
	public  BoardExample2()	{
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("db 연결 성공!!" + conn);
		
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
	}
	public void list()	{
		System.out.println();
		System.out.println("[게시글 목록]");
		System.out.println("------------------------------------------------------------");
		System.out.printf("%-4s%-12s%-20s%-20s \n" ,"no", "writer", "date", "title" );
		System.out.println("------------------------------------------------------------");
		
		
		//db -board 테이블의 게시글 목록 가져오기
		
		try {
			String sql= "select bno, btitle, bcontent, bwriter, bdate "
					+ " from board order by bno desc";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { //게시글이 있는 동안 반복 (다음 행으로 이동 )
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				//board.setBcontent(rs.getString("bcontent"));
				
				//게시글 출력 
				System.out.printf("%-4s%-12s%-20s%-20s \n",
							board.getBno(),
							board.getBwriter(),
							board.getBdate(),
							board.getBtitle()
							//board.getBcontent()
							);
				
					}//while 끝
			rs.close();
			pstmt.close();
				
				} catch (SQLException e) {
					e.printStackTrace();
					exit();
				}
		
		mainMenu();//mainMenu() 메서드 호출
	}
	
	public void mainMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.Create  |  2.Read  |  3.Clear  |  4.Exit");
		System.out.println("선택: ");
		
		String menuNo = scanner.nextLine();
		
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
			
		}
	}
	
	public void create() {
		//System.out.println("create() 메서드 실행됨");
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.println("제목: ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.println("내용: ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		
		System.out.println("작성자: ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		//db작업
		
		try {
			String  sql ="insert into board(bno, btitle, bcontent, bwriter) "
					+ "values (seq.nextval, ? , ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle()); // 콘솔에서 입력한 제목을 db에 저장
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			//sql실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		//목록 메서드 호출 
		list();
	}
	public void read()	{
		//System.out.println("read() 메서드 실행됨");
		System.out.println("[게시물 읽기]");
		System.out.println("글번호 입력: ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		//db 작업 - select ~where 절
		
		try {
			String sql = "select * from board where bno = ?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			//쿼리 실행 
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { //  찾는 자료가 있으면 
				Board board = new Board();
				//db의 값을 가져와서 board에 셋팅
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				//콘솔에 출력
				System.out.println("************************************");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("작성일: " + board.getBdate());
				System.out.println("************************************");
				//수정, 삭제 메뉴 만들기
				
				System.out.println("1.글수정 | 2.글삭제 | 3.글목록");
				System.out.println("선택: ");
				String menuNo = scanner.nextLine();
				
				if(menuNo.equals("1")) {
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		//글목록 메서드 출력
		list();
	}
	
	public void update(Board board) { //board - 이미 작성된 글을 가져와서 수정 
		System.out.println("[수정할 내용 입력] ");
		System.out.println("제목: ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.println("내용: ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		
		System.out.println("작성자: ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		//db작업 update 
		
		try {
			String sql = "UPDATE board SET btitle = ? , bcontent =?, bwriter= ?"
					+ "where bno=? ";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setInt(4, board.getBno());
			
			//sql 실행
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		}
	public void delete(Board board) {
		
		// 확인 , 취소 메뉴
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("1.Ok | 2.Cancel");
		System.out.println("선택: ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//db 작업 - delete
			try {
				String sql = "delete from board where bno= ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBno());
				//sql
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		
	}
	
	// 테이블은 유지하면서 전체 글 삭제  - sql : "truncate table board"
	public void clear()	{
		//System.out.println("clear() 메서드 실행됨");
		System.out.println("[전체 게시글 삭제] ");
		System.out.println("=================================");
		//확인, 취소 메뉴
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("1.Ok | 2.Cancel");
		System.out.println("선택: ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//db 작업 - truncate
			try {
				String sql = "truncate table board";
				pstmt = conn.prepareStatement(sql);
				//sql
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	
	
	public void exit()	{
		if(conn!= null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*** 게시판을 종료합니다. ***");
		System.exit(0);  // 즉시종료
		
	}

	public static void main(String[] args) {
		BoardExample2 board1 = new BoardExample2();
		board1.list();

	}

}
