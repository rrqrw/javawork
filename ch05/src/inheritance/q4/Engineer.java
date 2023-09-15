package inheritance.q4;

public class Engineer extends Employee{
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	public Engineer(String name) {
		super(name);
	}
	
	public void setSkillSet(String skillset) {
	this.skillset =skillset;
	}
}
