package interfaceex.remocon2;

import interfaceex.remocon.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		// 구현 객체(인스턴스) - tv
		SmartTV tv= new SmartTV();
		
		RemoteControl rc = tv;
		Searchable searchable= tv;
		
		rc.turnOn();
		rc.setVolume(8);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		
		
		RemoteControl.changeBattety();
		
		
	}

}
