package arraylist.score;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
		Student std1 = new Student(101, "우영우");
		
		std1.addSubject("국어", 90 );
		std1.addSubject("수학", 85 );
		std1.addSubject("Java", 82 );
		
		std1.showStudentInfo();

	}

}
