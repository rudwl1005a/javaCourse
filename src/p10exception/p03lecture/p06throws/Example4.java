package p10exception.p03lecture.p06throws;

public class Example4 {
	public static void main(String[] args) throws Exception { // JVM이 오류 받아서 실행
		System.out.println("프로그램 시작");

		method1();

		System.out.println("프로그램 종료");
	}

	public static void method1() throws Exception {
		System.out.println("메소드 1 시작");

		method2();

		System.out.println("메소드 1 종료"); // 도달 할 수도 안할 수도 있으므로 컴파일 오류 안남
	}

	public static void method2() throws Exception {
		System.out.println("메소드 2 시작");

		throw new Exception();

//		System.out.println("메소드 2 종료"); // 도달하지 못하는 코드 -> 컴파일 오류
	}
}
