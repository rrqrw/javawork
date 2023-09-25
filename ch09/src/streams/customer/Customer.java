package streams.customer;

public class Customer {
		// 필드 
	private String name; //이름	
	private int age;	// 나이
	private int price;	// 여행비용
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age= age;
		this.price= price;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}
	public int getPrice() {
		return price;
	}
	

}
