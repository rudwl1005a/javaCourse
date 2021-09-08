package p10exception.p03lecture.p06throws;

public class Example6FlowThrows {
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 실행"); // 1

		method1(); // -> JVM으로 넘어감

		System.out.println("프로그램 종료"); // 실행되지 않음
	}

	public static void method1() throws Exception {
		throw new Exception(); // 2
	}
}
