package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("콩쥐",80),
				new Student("팥쥐",70),
				new Student("심청",90)
				);
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std->{
			//System.out.println(std.getName()+ " : "+ std.getScore());
			String name = std.getName()	;
			int score = std.getScore();
			System.out.println(name+ " : "+ score);
		});
		
		// 학생의 이름만 출력
		// map() - 매개변수에 매핑(일치)되는 것을 구현할때 쓰는 함수  
		// 학생 객체에 있는 이름만 출력 
		stdStream = list.stream();	//steam객체는 한번만 사용하면 소모되므로  다시 값을 저장함
		stdStream.map(std -> std.getName())
				.forEach(s -> System.out.println(s));
		
		
		//학생 점수에 해당되는 내용만 출력 
		// 정수인경우 - mapToInt ()사용 
		stdStream = list.stream();	
		stdStream.mapToInt(std -> std.getScore())
				.forEach(n -> System.out.println(n));
		
		// 함수가 90점 이상인 학생의 이름 출력 
		// filter()함수 - 조건에 일치되는 내용을 걸러낼때 사용함 
		list.stream().filter(std -> std.getScore() >= 90)
					.map(std -> std.getName())
					.forEach(s -> System.out.println(s));
		
		

	}

}
