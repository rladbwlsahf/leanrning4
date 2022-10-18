package Human04;

public class Car {
	//	1.	멤버변수
	Tire forntLeftTire = new KTire();
	Tire forntRightTire = new KTire();
	Tire rearLeftTire = new KTire();
	Tire rearRightTire = new KTire();
	//	2.	생성자
	public Car() {}
	//	3.	메서드
	public void run() {
		System.out.print("front - left :  \n");
		forntLeftTire.roll();
		
		System.out.print("front - right :  \n");
		forntRightTire.roll();

		System.out.print("rear - left :  \n");
		rearLeftTire.roll();
		
		System.out.print("rear - right :  \n");
		rearRightTire.roll();
		
	}
}
