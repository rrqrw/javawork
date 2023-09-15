package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadShop shop1 = new Shop1();
		
		shop1.비빔밥();
		
		System.out.println("==========================");
		
		HeadShop shop2 = new Shop2();
		
		shop2.비빔밥();
		// 기본자료형에서 형변환
		int iNum = 10;
		double dNum ;
		dNum = iNum;
		System.err.println(dNum); // 10.0
		
		iNum = (int)dNum; // 강제 형변환 
		System.out.println(iNum);

	}

}
