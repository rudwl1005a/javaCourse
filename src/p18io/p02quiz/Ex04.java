package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		// 각자 가진 그림 파일 내용으로 채워진 새 파일 만들기
		// 파일명 outtest2 (원본 파일 확장자 사용)
		// 원본 파일과 같은 크기, 같은 내용 (파일 복사)
		InputStream is = new FileInputStream("C:\\Users\\com\\Desktop\\course\\iotest\\다운로드.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\com\\Desktop\\course\\iotest\\outtest2.jpg");

		int data = 0;
		while ((data = is.read()) != -1) {
			os.write(data); // 파일 크기 만큼 반복
		}

		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
