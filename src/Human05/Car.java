package Human05;

public class Car {
	//	1.	멤버변수
	public Tire forntLeftTire;
	public Tire forntRightTire;
	public Tire rearLeftTire;
	public Tire rearRightTire;
	//	2.	생성자
	public Car(	Tire forntLeftTire
			,	Tire forntRightTire
			,	Tire rearLeftTire
			,	Tire rearRightTire) {
		this.forntLeftTire = forntLeftTire;
		this.forntRightTire = forntRightTire;
		this.rearLeftTire = rearLeftTire;
		this.rearRightTire = rearRightTire;
		}
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
