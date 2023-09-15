package objecarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고 
		// 정보를 출력하세요
         Dog[] dogs = new Dog[4];
         // 배열에 저장(입력)
         dogs[0]= new Dog("백구", "진돗개");
         dogs[1]= new Dog("해피", "시츄");
         dogs[2]= new Dog("대박", "불독");
         dogs[3]= new Dog("사랑", "치와와");
       
         for(int i=0; i<dogs.length; i++) {
        	 System.out.println(dogs[i].getName()+","+
         dogs[i].getType());
         }
         
         //향상된 for문
         for(Dog dog : dogs) {
        	 System.out.println(dog.getName()+ ","+dog.getType());
         }
	}
	
	 

}
