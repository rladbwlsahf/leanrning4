package Human09;

public class ClassExam {

	public static void main(String[] args) {
		ClassC c3 = new ClassC();
		InterFaceC ic3 = c3;
		//	InterFaceC ic3 = new ClassC();
		
		ic3.methodA();
		ic3.methodB();
		ic3.methodC();
		
		InterFaceA ic1 = ic3;
		ic1.methodA();
//		ic1.methodB();
//		InterFaceA를 구현한 ic1은 methodB()가
//		없기 때문에 실행 불가.
//		methodB()는 InterFaceB에 정의한 것이므로
	}

}
