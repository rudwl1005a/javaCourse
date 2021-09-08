package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleAMultiple {
	// 한 메소드에서 여러개의 예외처리가 필요할때
	// 두번째 방법 : try ~ catch문으로 해결
	public static void main(String[] args) {

		// 1. try ~ catch
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2. try ~ multi-catch
		try {
			method1();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		// 3. try ~ multi-catch 다형성
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");

		FileReader fr = new FileReader("");

		fr.close();
	}
}
