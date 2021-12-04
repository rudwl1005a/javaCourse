package p18io.p03lecture.p06filter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex05BufferedInputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestF.txt";
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);

		long start = System.currentTimeMillis();
//		while (is.read() != -1) {//1346ms 1326ms
		while (bis.read() != -1) {// 21ms 20ms

		}
		long end = System.currentTimeMillis();

		System.out.println((end - start) + "ms");

		bis.close();
		is.close();

	}
}
