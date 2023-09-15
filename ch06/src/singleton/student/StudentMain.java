package singleton.student;

public class StudentMain {
	

	public static void main(String[] args) {
	School school = School.getInstance();
	
	Student friend1 = school.createStudent();
	Student friend2 = school.createStudent();
	Student friend3 = school.createStudent();
	System.out.println("학번: " +friend1.getSerialNum());
	System.out.println("학번: " +friend2.getSerialNum());
	System.out.println("학번: " +friend3.getSerialNum());
	
	// 학교 객체의 주소 
    System.out.println(school);
    
    
    //학생객체의 주소
    System.out.println(friend1);
	
		

	}

}
