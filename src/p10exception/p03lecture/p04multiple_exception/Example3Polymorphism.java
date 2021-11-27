package p10exception.p03lecture.p04multiple_exception;

public class Example3Polymorphism {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String a = "aaa";
		
		try {
			int i = Integer.parseInt(a);
		} catch (Throwable e) {
			System.out.println("넘버포맷익셉션 발생");
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료 ");
	}
}
