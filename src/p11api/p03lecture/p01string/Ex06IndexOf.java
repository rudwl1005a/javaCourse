package p11api.p03lecture.p01string;

public class Ex06IndexOf {
	public static void main(String[] args) {
		String s1 = "java와 javascript는 java도 oop고 javascript도 oop다";

		System.out.println(s1.indexOf("java")); // 첫번째 java
		System.out.println(s1.lastIndexOf("java")); // 마지막 java

		// 5번째부터 시작해서 "java"를 찾아라
		System.out.println(s1.indexOf("java", 5)); // 6
		// 10번째부터 시작해서 "java"를 찾아라
		System.out.println(s1.indexOf("java", 10)); // 18
	}
}
