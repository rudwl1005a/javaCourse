package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\com\\Desktop\\course\\iotest\\outtest8.txt";
		Writer wr = new FileWriter(file);

		// ABCDE~Z
//		for (char c = 'A'; c <= 'Z'; c++) {
//			wr.write(c);
//		}

		for (int i = 0; i < 26; i++) {
			wr.write(65 + i);
		}

		System.out.println("프로그램 종료");
		wr.close();
	}
}
