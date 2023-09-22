package basicclass;

public class Book{
	int bookNumber;     //책 번호
	String bookTitle;   //책 제목
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	//메서드 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
		
}
