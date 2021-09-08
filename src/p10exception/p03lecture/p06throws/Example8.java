package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {

		// method1
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			method2(); // 오류!
//		} catch (IOException e) { // -> Exception은 IOException의 상위 클래스이기 때문에 안된다. 
		} catch (Exception e) { // 고친 코드
			e.printStackTrace();
			System.out.println(e instanceof Exception); // true
			System.out.println(e instanceof IOException); // true
		}

	}

	public static void method1() throws IOException {
		throw new IOException();
	}

	public static void method2() throws Exception {
		throw new IOException();
	}
}
