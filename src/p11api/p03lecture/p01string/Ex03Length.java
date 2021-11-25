package p11api.p03lecture.p01string;

public class Ex03Length {
	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1.length()); // 4

		String s2 = "spring";
		System.out.println(s2.length()); // 6

		String s3 = " java";
		System.out.println(s3.length()); // 5

		String s4 = "          "; // space 10개
		System.out.println(s4.length()); // 10

		String s5 = "세종대왕";
		System.out.println(s5.length()); // 4

		String s6 = "java가 제일 쉬웠어요";
		System.out.println(s6.length()); // 13

		String s7 = "j\ta"; // \t가 1글자 취급(tab의미)
		System.out.println(s7.length()); // 3

		String s8 = "j\na";
		System.out.println(s8.length()); // 3
	}
}
