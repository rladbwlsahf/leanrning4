package Human09;

public interface InterFaceC extends InterFaceA,InterFaceB {
	// 인터페이스도 상속받을 수 있다.
	// InterFaceC는 methodC뿐만 아니라.
	// methodA,methodB도 구현해야 한다.
	public void methodC();
}
