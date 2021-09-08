package p10exception.p02quiz;

public class Example7 {
	// 일반 예외(checked exception)을 발생시키는 코드를 작성

	public static void main(String[] args) {
		InterruptedException e = new InterruptedException();

		try {
			throw e;
		} catch (InterruptedException e1) {
			System.out.println("인터럽티드익셉션 발생");
		}
	}
}
