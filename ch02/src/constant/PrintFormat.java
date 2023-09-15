package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷", 객체)
		// 대응 서식: 정수 - %d, 실수 - %f 문자 - %s
		//deacimal (10진수)정수
		// 줄바꿈 문자-\n,  탭 (띄어쓰기)- \t
		int year = 2023;
		System.out.printf("올해는 %d년입니다.", year);
		

		float weight = 63.7f;
		System.out.printf("그것의 무게는 %.2f kg 입니다.\n",weight);

		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n",nick);
		// '\t' 사용
		//int num = 0;
		//num+= 1;//num = num + 1
		

		String table = ""; //빈 문자열 초기화
		table += "-------------------\n";
		table += "이름\t나이\t나라\n";
		table += "-------------------\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "-------------------\n";
		System.out.println(table);
	}

}
