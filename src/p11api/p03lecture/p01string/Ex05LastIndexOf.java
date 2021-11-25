package p11api.p03lecture.p01string;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		// lastIndexOf
		String s1 = "java보다 javascript가 더 쉬웠어요";
		System.out.println(s1.indexOf("java")); // 0
		System.out.println(s1.lastIndexOf("java")); // 7
		System.out.println(s1.lastIndexOf("python")); // 못찾으면 -1
	}
}
