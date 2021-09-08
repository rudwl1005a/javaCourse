package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example7Casting {
	public static void main(String[] args) {
		// try ~ catch

		try {
			throw new NullPointerException();
//		} catch (NullPointerException e) {
		} catch (Exception e) { // 윗줄과 같음 (다형성)
			System.out.println("익셉션 발생");
		}
	}

//	public static void method1() throws IOException{
	public static void method1() throws Exception { // 다형성 때문에 가능
		throw new IOException();
	}
}
