package Human01;

public class TvExam {

	public static void main(String[] args) {
//		RemoteControl rc = new Telvision();
		Telvision tv = new Telvision();
		
		RemoteControl rc1 = tv;
		//	rc는 구현객체이고,tv는 구현클래스의 객체
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(true);
		rc1.setVolume(RemoteControl.MIN_VOL);
		//	RemoteControl.MIN_VOL ==> 0
		//	그래서 rc.setVolume(0)와 같은 동작을 함.
		rc1.turnOff();
		RemoteControl.changeBatt();
		
		System.out.println("-------------------");
		
		Audio au= new Audio();
		RemoteControl rc2 = au;
		//	rc는 구현객체이고,tv는 구현클래스의 객체
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setMute(true);
		rc2.setVolume(RemoteControl.MIN_VOL);
		//	RemoteControl.MIN_VOL ==> 0
		//	그래서 rc.setVolume(0)와 같은 동작을 함.
		rc2.turnOff();
		RemoteControl.changeBatt();
		
		
	}

}
