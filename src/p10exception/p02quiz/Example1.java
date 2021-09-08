package p10exception.p02quiz;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		method(null);

		System.out.println("프로그램 종료");
	}

	public static void method(Object o) {
		try {
			System.out.println(o.hashCode());
		} catch (NullPointerException e) {

		}
	}

}
