package jsondata;

import org.json.JSONObject;

public class CreateJsonEx {

	public static void main(String[] args) {
		// json 데이터 만들기 (생성)
		JSONObject member = new JSONObject();
		
		//속성 및 속성값 추가 
		member.put("id", "sky123");
		member.put("name", "이하늘");
		
		//문자열 출력
		String json = member.toString();
		System.out.println(json);
 
	}

}
