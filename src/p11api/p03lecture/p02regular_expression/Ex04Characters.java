package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex04Characters {
	public static void main(String[] args) {
		String p1 = "[abcd]";

		System.out.println(Pattern.matches(p1, "a")); // true
		System.out.println(Pattern.matches(p1, "b")); // true
		System.out.println(Pattern.matches(p1, "c")); // true
		System.out.println(Pattern.matches(p1, "d")); // true

		System.out.println("--------------------------------");

		String p2 = "[a-d]"; // a부터 d까지

		System.out.println(Pattern.matches(p2, "a")); // true
		System.out.println(Pattern.matches(p2, "b")); // true
		System.out.println(Pattern.matches(p2, "c")); // true
		System.out.println(Pattern.matches(p2, "d")); // true

		System.out.println("--------------------------------");

		String p3 = "[0-9]"; // 숫자로 표현되어 있는지

		System.out.println(Pattern.matches(p3, "0")); // true
		System.out.println(Pattern.matches(p3, "4")); // true
		System.out.println(Pattern.matches(p3, "9")); // true

		System.out.println("--------------------------------");

		String p4 = "[A-Z]"; // 영대문자로 표현되어 있는지

		System.out.println(Pattern.matches(p4, "A")); // true
		System.out.println(Pattern.matches(p4, "S")); // true
		System.out.println(Pattern.matches(p4, "Z")); // true

		System.out.println("--------------------------------");

		String p5 = "[a-zA-Z]"; // 영어 대소문자로 표현되어 있는지

		System.out.println(Pattern.matches(p5, "A")); // true
		System.out.println(Pattern.matches(p5, "a")); // true
		System.out.println(Pattern.matches(p5, "Z")); // true
		System.out.println(Pattern.matches(p5, "z")); // true
		System.out.println(Pattern.matches(p5, "S")); // true
		System.out.println(Pattern.matches(p5, "s")); // true
	}
}
