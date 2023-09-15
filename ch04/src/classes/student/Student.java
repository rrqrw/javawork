package classes.student;

// 참조(레퍼런스) 자료형
public class Student {
	//클래스 내부에서는  변수를필드( field)라고함
	String name;  // 학생이름("홍길동")
	int studentId; // 학번(101)
	int grade;// 학년
	
	// 함수가 아니므로 반환이 없음 
	// 클래스 이름과 같음 
	// 기본 생성자(매개변수 없는 생성자)는 생략 가능 (컴파일러가 자동생성함)
	public Student() {} // 기본생성자
	
	//학생의 정보를 출력하는 메서드(함수)
public void showStudntInfo() {
	System.out.println("이름: " + name + ", 학번: "
						+studentId +", 학년: "+ grade );
}
}
