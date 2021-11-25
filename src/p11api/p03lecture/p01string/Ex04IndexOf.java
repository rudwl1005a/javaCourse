package p11api.p03lecture.p01string;

public class Ex04IndexOf {
	public static void main(String[] args) {
		// index는-> 012345
		String s1 = "spring";

		// indexOf는 해당 문자열이 시작하는 index를 반환
		System.out.println(s1.length());
		System.out.println(s1.indexOf("ring")); // 2
		System.out.println(s1.indexOf("sp")); // 0
		System.out.println(s1.indexOf("ps")); // 못찾으면 -1

		String s2 = "java보다 javascript가 더 쉬웠어요";
		System.out.println(s2.indexOf("script")); // 11
		System.out.println(s2.indexOf("java")); // 0 -> 처음에 나오는 문자열의 index 반환
	}
}
