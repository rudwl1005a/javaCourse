package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);

		// 첫번째 방법 try~catch
		try {
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 두번째 방법
		// main에 throws IOException을 추가
		isr.close();
	}
}
