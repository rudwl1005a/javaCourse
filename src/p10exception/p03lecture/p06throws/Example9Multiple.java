package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example9Multiple {
	// 한 메소드에서 여러개의 예외처리가 필요할때
	// 첫번째 방법 : throws에서 ,로 나열한다
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		method1();
	}

	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");

		FileReader fr = new FileReader("");

		fr.close();
	}
}
