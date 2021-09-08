package p10exception.p03lecture.p06throws;

import java.io.FileReader;

public class ExampleBMultiple {
	// 예외처리 다형성
	public static void main(String[] args) throws Exception {
		method1();
	}

	public static void method1() throws Exception {
		Class.forName("");

		FileReader fr = new FileReader("");

		fr.close();
	}
}
