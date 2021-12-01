package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iotest\\다운로드.jfif"); // 6778 bytes
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtest5.jfif");
		
		byte[] datas = new byte[100];
		
		for (int i = 0; i < 68; i++) {
			if (i == 67) {
				is.read(datas);
				os.write(datas, 0, 78);
			} else {
				is.read(datas); // 읽고
				os.write(datas); // 쓰고
			}
		}
		
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
