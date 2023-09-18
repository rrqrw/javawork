package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {

		//String[] carts = new String [4];
		//String [] carts= new String[]{"사과","콩나물","커피","우유"};
		
		// 리스트 공간이 10개 생성 
		// 리스트는 순서가 있음 (인덱싱)
		// 중복 허용 
		ArrayList<String> carts= new ArrayList<>();
		
		
		// 자료 추가 -add() 
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");
		carts.add("커피");
		// 자료출력 - get()
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		System.out.println(carts.get(3));
		
		
		
		//자료 수정 -set()[
		carts.set(2, "바나나");
		
		// 자료 삭제 - remove()
		//carts.remove(1);
		carts.remove("콩나물");
		
		//리스트의 크기 
		System.out.println("리스트의 크기: " + carts.size());
		
		
		// 전체 조회(출력)
		for(int i=0; i< carts.size(); i++) { // 리스트를 처음부터 반복하면서 
			 String cart =  carts.get(i);// 저장된자료를 가져와서 cart에 저장
			 System.out.print(cart+ " ");
			 
			
		}
		System.out.println();
		
		// 향상된 for문- for (자료형 변수: 리스트이름){}
		for(String cart : carts) 
			System.out.print(cart + " ");
			
		}
	}


