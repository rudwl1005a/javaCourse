package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestF.txt";
		String des = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestG.txt";

		// 파일 복사 (BufferedInputStream, BufferedOutputStream 활용)

		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);

		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);

		int data = 0;

		long start = System.currentTimeMillis();
//		while ((data = is.read()) != -1) { //3316ms
//			os.write(data);
//		}

		while ((data = bis.read()) != -1) { // 34ms
			bos.write(data);
		}
		long end = System.currentTimeMillis();

		System.out.println((end - start) + "ms");

		bos.close();
		bis.close();
		is.close();
		os.close();

	}
}
