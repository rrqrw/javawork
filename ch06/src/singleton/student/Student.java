package singleton.student;

public class Student {
	private static int serialNum =100;
	private int studentNum;
	
	public Student() {
		serialNum++;
		studentNum=serialNum;
		
	}
	public int getSerialNum() {
		return studentNum;
	}
	

}
