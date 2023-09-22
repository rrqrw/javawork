package nestedclass.interfaces;

public class ButtonTest {

	public static void main(String[] args) {
		// 버튼 객체 생성
		Button button = new Button();
		// 전화걸기 객체 생성
		CallListener call = new CallListener();
		//MessageListner message = new MessageListner();
		// 전화걸기 
		button.setListener(call);
		button.touch();
		// 문자 보내기 
		button.setListener(new MessageListner());
		button.touch();
		
		// 사진찍기 구현 
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		button.touch();
		
		//쇼핑 - 구매 구현 
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("상품을 구매합니다.");
				
			}
		});
		button.touch();
		

	}

}
