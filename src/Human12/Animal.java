package Human12;

public abstract class Animal extends Creature{

	public Animal(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("몸을 이용하여 공격합니다.");
		
	}

}
