package collection.list;

import java.util.*;


public class BordTest {

	public static void main(String[] args) {
		// ArrayList 또는 Vector 를 사용 
		//ArrayList<Board> list = new ArrayList<>;
		//List<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		//Borad  객체 (게시글)
		Board board1 = new Board("제목1", "내용 1입니다.", "글쓴이1");
		Board board2 = new Board("제목2", "내용 2입니다.", "글쓴이2");
		Board board3 = new Board("제목3", "내용 3입니다.", "글쓴이3");
		
		// Board 객체를 Vector 리스트에 저장 
		list.add(board1);  //0번
		list.add(board2);	//1번
		list.add(board3);	//2번 
		
		// 게시글 1개 삭제 (1번 인덱스)
		if(list.contains(board1)) { 
			list.remove(board1); //객체 (object)로 삭제 가능 
			//list.remove(1); //index로 삭제 가능 
		}
		
		// 맨 앞에 객체 가져오기(0번 인덱스)
		System.out.println("title: "+list.get(0).getTitle());
		System.out.println("content: "+list.get(0).getContent());
		System.out.println("writer: "+list.get(0).getWriter());
		
		// 전체 목록
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle()+", "+
			board.getContent() + ", "+ board.getWriter());
		}
		
	}

}
