package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex02BufferedReader {
	public static void main(String[] args) throws Exception {
		// BufferedReader : 속도 향상
		String name = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestE.txt";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);

		long start = System.currentTimeMillis();
//		while (reader.read() != -1) { // Reader 사용 35198ms, 35250ms
		while (br.read() != -1) { // BufferedReader 사용 17921ms, 17932ms

		}
		long end = System.currentTimeMillis();

		System.out.println(end - start + "ms");
		br.close();
		reader.close();
	}
}
