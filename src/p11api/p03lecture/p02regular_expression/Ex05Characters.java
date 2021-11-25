package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex05Characters {
	public static void main(String[] args) {
		String p1 = "[^a]"; // not a -> a만 아니면 된다

		System.out.println(Pattern.matches(p1, "a")); // false
		System.out.println(Pattern.matches(p1, "b")); // true
		System.out.println(Pattern.matches(p1, "c")); // true

		System.out.println("--------------------------------");

		String p2 = "[^a-z]"; // 소문자만 아니면 된다.
		System.out.println(Pattern.matches(p2, "a")); // false
		System.out.println(Pattern.matches(p2, "B")); // true
		System.out.println(Pattern.matches(p2, "c")); // false

		System.out.println("--------------------------------");

		String p3 = "[a-z^c]"; // a에서z c만빼고? -> no, a-z그리고 ^문자 포함
		System.out.println(Pattern.matches(p3, "a")); // true
		System.out.println(Pattern.matches(p3, "c")); // true
		System.out.println(Pattern.matches(p3, "^")); // true

		System.out.println("--------------------------------");

		String p4 = "[a-bd-z]"; // c만빼고 영소문자
		System.out.println(Pattern.matches(p4, "c")); // false
		System.out.println(Pattern.matches(p4, "a")); // true
		System.out.println(Pattern.matches(p4, "z")); // true

		System.out.println("--------------------------------");

		String p5 = "[a-z&&[^c]]"; // p4와 같은 표현
		System.out.println(Pattern.matches(p4, "c")); // false
		System.out.println(Pattern.matches(p4, "a")); // true
		System.out.println(Pattern.matches(p4, "z")); // true
	}
}
