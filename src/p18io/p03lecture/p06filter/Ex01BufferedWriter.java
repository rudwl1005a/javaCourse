package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception {
		// BufferedWriter
		// 빠른 속도

		String name = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestE.txt";
		Writer writer = new FileWriter(name);
		BufferedWriter bw = new BufferedWriter(writer);

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1024 * 1024 * 1024; i++) {
//			writer.write('a'); // Writer // 26627 ms, 26539 ms
			bw.write('a'); // BufferedWriter // 11509 ms, 18532 ms
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start + "밀리세컨드");

		System.out.println("종료");

		bw.close();
		writer.close();
	}
}
