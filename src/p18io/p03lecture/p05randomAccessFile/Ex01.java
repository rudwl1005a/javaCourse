package p18io.p03lecture.p05randomAccessFile;

import java.io.RandomAccessFile;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\com\\Desktop\\course\\iotest\\raf.txt";
		RandomAccessFile raf = new RandomAccessFile(name, "rw");

		raf.write('a');
		raf.write('b');
		raf.write('c');

		raf.seek(1);

		raf.write('d');
		raf.write('e');

		raf.close();
		System.out.println("프로그램 종료");
	}
}
