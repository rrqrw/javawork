package reference.circde;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1= new Circle(2,3,5);
		c1.showCircleInfo();
		
		
		Circle c2 =new Circle(10,12,10);
		c2.showCircleInfo();*/
		
		
		/*Circle[] circle= {
				new Circle(2,3,5), //circle[0]
				new Circle(10,12,10),//circle[1]
				new Circle(-10,-12,10)//circle[2]
		};*/
		
		Circle[] circle = new Circle[3];
				circle[0]=new Circle(2,3,5); //circle[0]
				circle[1]=new Circle(10,12,10);//circle[1]
				circle[2]=new Circle(-10,-12,10);//circle[2]
		//2번 인덱스 출력
		circle[2].showCircleInfo();
		System.out.println("===============================");
		
		// 전체 조회(출력)
		for(int i=0; i<circle.length; i++) {
			circle[i].showCircleInfo();
		}
		
	}

}
