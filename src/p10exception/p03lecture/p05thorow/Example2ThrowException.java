package p10exception.p03lecture.p05thorow;

import java.io.IOException;

public class Example2ThrowException {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		// RuntimeException을 상속 받지 않은 Exception은
		// try/catch를 사용해야 함

		IOException e = new IOException();

		try {
			throw e;
		} catch (IOException e1) {
			System.out.println("아이오익셉션 발생");
		}

	}
}
