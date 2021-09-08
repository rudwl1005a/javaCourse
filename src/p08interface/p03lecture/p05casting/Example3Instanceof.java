package p08interface.p03lecture.p05casting;

public class Example3Instanceof {
	public static void main(String[] args) {
		String str = "java";
		method(str);

		int[] arr = { 1, 2 };
		method(arr);

		System.out.println("프로그램을 종료합니다.");
	}

	public static void method(Object o) {
		System.out.println(o instanceof String);
//		String s = (String) o;

		if (o instanceof String) {
			String s = (String) o;
			System.out.println("String으로 변환 가능");
		} else {
			System.out.println("String으로 변환 불가능");
		}
	}

}
