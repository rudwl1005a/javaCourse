package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex03Characters {
	public static void main(String[] args) {
//		String p1 = "";
		String p1 = "[abc]"; // a나b나c가 있는지 확인

		// 희망사항
		System.out.println(Pattern.matches(p1, "a")); // true
		System.out.println(Pattern.matches(p1, "b")); // true
		System.out.println(Pattern.matches(p1, "c")); // true

		System.out.println(Pattern.matches(p1, "d")); // false
		System.out.println(Pattern.matches(p1, "e")); // false
		System.out.println(Pattern.matches(p1, "f")); // false

		System.out.println("--------------------------------");

		String p2 = "[azAZ]";

		System.out.println(Pattern.matches(p2, "a")); // true
		System.out.println(Pattern.matches(p2, "z")); // true
		System.out.println(Pattern.matches(p2, "A")); // true
		System.out.println(Pattern.matches(p2, "Z")); // true

		System.out.println(Pattern.matches(p2, "b")); // false
		System.out.println(Pattern.matches(p2, "B")); // false

		System.out.println("--------------------------------");

		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		System.out.println(Pattern.matches(p3, "a")); // true
		System.out.println(Pattern.matches(p3, "g")); // true
		System.out.println(Pattern.matches(p3, "h")); // true

		System.out.println(Pattern.matches(p3, "A")); // false
		System.out.println(Pattern.matches(p3, "G")); // false
		System.out.println(Pattern.matches(p3, "H")); // false

	}
}
