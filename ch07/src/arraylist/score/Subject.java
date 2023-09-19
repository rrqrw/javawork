package arraylist.score;

// Subject 자료형 정의
public class Subject {
	// 필드 
	private String subjectName;// 과목이름
	private int scorePoint;// 과목 점수 
	public Subject() {}
	// 생성자 
	public Subject(String subjectName, int scorePoint) {
		this.subjectName =subjectName;
		this.scorePoint = scorePoint;
	}
	// getter, setter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	
	}
		public String getSubjectName() {
			return subjectName;
		}
		
		public void setScorePoint(int scorePoint) {
			this.scorePoint = scorePoint;
			}
		
		public int getScorePoint() {
			return scorePoint;
		}
		
	

}
