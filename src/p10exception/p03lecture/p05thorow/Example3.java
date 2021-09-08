package p10exception.p03lecture.p05thorow;

public class Example3 {
	public static void main(String[] args) {

		// 일반예외 (checked exception) :
		// Exception 중 RuntimeException을 상속 받지 않은 것

		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		}

		// 실행예외 (unchecked exception) :
		// Exception 중 RuntimeException을 상속 받은 것

		throw new RuntimeException();

	}
}
