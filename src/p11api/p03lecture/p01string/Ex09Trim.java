package p11api.p03lecture.p01string;

public class Ex09Trim {
	public static void main(String[] args) {
		// 앞뒤 공백을 없애는 trim
		String s1 = "   java    ";
		String s2 = s1.trim();

		System.out.println(s1);
		System.out.println(s2);
	}
}
