package collection.set;

public class Student {
	String name;
	int age; 
	
	public Student(String name, int age) {
		this.name= name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " ,"+ age ;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(name.equals(student.name))
				return true;

		}
		return false;
	}

	
	
	
}
