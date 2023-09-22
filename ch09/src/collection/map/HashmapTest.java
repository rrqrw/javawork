package collection.map;

// ctrl + shift+ o  -임포트 단축키 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장 
		map.put("이순신", 95); // key , value
		map.put("양만춘", 87);
		map.put("강감찬", 79);
		map.put("이순신", 85);
		
		// 특정 객체 조회
		System.out.println(map.get("양만춘"));
		
		// 객체 삭제
		if(map.containsKey("강감찬")) { // 객체가 map에 포함되어있다면
			map.remove("강감찬");// 키를삭제 -> 값도 삭제 
		}
		
		// 총 객체수 
		System.out.println("총 객체수: " + map.size());
		
		
		//전체 조회
		Set<String>keySet = map.keySet();// key 값 객체를 생성
		Iterator<String> ir = keySet.iterator()	;// 키값으로 반복할 반복자 객체 생성 
		while(ir.hasNext()) { // 객체 수만큼 반복
			String key = ir.next();//객체가 있으면 1개씩 가져옴 
			Integer value = map.get(key);
			System.out.println(key+":"+ value);
			System.out.println("====================");
		}
		// 조회2
		for(String key : keySet) {
			System.out.println(key + ":"+ map.get(key));
		}
		// 객체 자체를 출력  -{key =value,}
		System.out.println(map);
		
		
	}

}
