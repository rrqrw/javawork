package exeptions.resource;

public class MyResourceTest {

	public static void main(String[] args) throws Exception {
		
		MyResource res1 = new MyResource("res1");
		
		
		
		
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));
		
		
		 res1.close();
		
	
	}

}
