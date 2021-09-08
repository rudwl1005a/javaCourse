package p06class.p03lecture.p01static;

public class StaticEx05ClassInstance {
	public static void main(String[] args) {

		Class05.method2();
//		Class05.method1(); // 오류!

		Class05 c1 = new Class05();
		c1.method1();

	}
}

class Class05 {
	// 인스턴스 메서드, 멤버 메서드
	public void method1() {
		System.out.println("instance method");
	}

	// 클래스 메서드, 스태틱 메서드
	public static void method2() {
		System.out.println("static method");
	}
}
