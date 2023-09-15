package singleton.student;

public class School {
	private static School instance;
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
			
		}
		return instance;
	}
	
	public Student createStudent() {
		Student std = new Student();
		return std;
	}
}
