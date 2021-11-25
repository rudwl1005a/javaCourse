package p11api.p03lecture.p01string;

public class Ex01String {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");

		System.out.println(s1);
		System.out.println(s2);

		// 이렇게 비교하면 안된다. -> 실제 참조값이 다르기 때문에 false
		System.out.println(s1 == s2);

		// 같은지 비교하기 위해서는 .equals()사용
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));

	}
}
