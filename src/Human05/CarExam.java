package Human05;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car(new KTire(), new KTire(), 
				new KTire(), new KTire());
		car.run();
		System.out.println("------------------");
		car.forntLeftTire = new HTire();
		car.run();
	}

}
