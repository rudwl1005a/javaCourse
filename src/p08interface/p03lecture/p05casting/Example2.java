package p08interface.p03lecture.p05casting;

import java.io.Serializable;

public class Example2 {
	public static void main(String[] args) {
		String str = "java";
		method(str); // 1

		int[] arr = { 1, 2 };
		method(arr); // 6

		System.out.println("프로그램을 종료합니다.");
	}

	public static void method(Object o) {
		// 하위 타입으로 강제 형변환
		String s = (String) o; // 2, 7 -> 7번에서 오류가 난다
		Serializable se = (Serializable) o; // 3
		Comparable<String> com = (Comparable<String>) o; // 4
		CharSequence c = (CharSequence) o; // 5
	}

}
