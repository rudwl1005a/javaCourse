package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;

public class Example2Throws {
	public static void main(String[] args) {
//		method1();	// 오류!
		// -> try/catch 또는 또 한번 throws사용
		try {
			method1();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
	}

	public static void method1() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
