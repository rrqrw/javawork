package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		//객체 저장할 크기가 3인 배열 생성
		Book[] books = new Book[3];
		//
		Book book1 = new Book("개미" , "베르나르 베르베르");
		Book book2 = new Book("태백산맥", "조정래");
		Book book3 = new Book("미생", "조태호");
		//
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		System.out.println(books[2]);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i]);   // get으로 출력안해서 toSting 씀
		}
		
		
	}

}
