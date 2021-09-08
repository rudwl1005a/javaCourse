package p10exception.p03lecture.p06throws;

public class Example5FlowTryCatch {
	public static void main(String[] args) {
		System.out.println("프로그램 실행"); // 1

		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace(); // 3
		}

		System.out.println("프로그램 종료"); // 4
	}

	public static void method1() throws Exception {
		throw new Exception(); // 2
	}
}
