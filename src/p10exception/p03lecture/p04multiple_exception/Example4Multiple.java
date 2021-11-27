package p10exception.p03lecture.p04multiple_exception;

public class Example4Multiple {
	public static void main(String[] args) {
		
		String[] arr = {"1", "a"};
		
		try {
			int n = Integer.parseInt(arr[1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오버");
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
	}
}
