package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList; // ArrayList - Subject 객체를 저장할 배열(리스트)
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName= studentName;
		subjectList= new ArrayList<>();
		
	}
	
	// 과목추가 
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name , score); // 매개 변수로 외부에서 입력
		subjectList.add(subject);
	}

	
	// 학생의 정보 출력
	public void showStudentInfo() {
		int total = 0;
		double avg; 
		for(int i=0; i<subjectList.size(); i++) {
		Subject s = subjectList.get(i);
		total += s.getScorePoint(); // 점수 더하기
		
		System.out.printf("학생 %s의 %s 과목의 점수는 %d점입니다.\n", studentName,
				s.getSubjectName(), s.getScorePoint());
	}
		//평균계산
		avg =(double)total / subjectList.size();
		System.out.printf("%s의 총점은 %d점이고, 평균은 %.1f점 입니다." , studentName, total,avg);
		
}
	
}
