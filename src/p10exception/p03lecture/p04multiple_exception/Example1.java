package p10exception.p03lecture.p04multiple_exception;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String[] arr = {"3", "4", "a"};
		
		try {
			int n = Integer.parseInt(arr[3]);
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		} catch (NumberFormatException e) {
			System.out.println("넘버포맷익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
	}
}
