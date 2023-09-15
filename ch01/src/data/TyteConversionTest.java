package data;

public class TyteConversionTest {

	public static void main(String[] args) {
		// 형 변환 - 1. 자동 형변한  왼쪽이 크고 오른쪽이작으면 자동
		//         2. 강제 형변환  왼쪽이 작고 오른쪽이크면 강제
		int iNum = 20;
		float fNum = iNum; // 실수형(4byte) = 정수형(4byte)
		System.out.println(iNum);//20
		System.out.println(fNum);//20.0
		
		double dNum; //실수형 8byte
		dNum = iNum + fNum;  // 자동형변환(묵시적 형변환)	
		System.out.println(dNum);// 40.0
		
		
		//2. 강제 형변환(cast)
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum2 = (int)dNum1 + (int)fNum2;  //1 + 0
		System.out.println(iNum2);
		int iNum3 = (int)(dNum1 + fNum2);//(int)1.2 + 0.9
		System.out.println(iNum3);
		

	}

}
