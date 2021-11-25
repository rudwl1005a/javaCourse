package p11api.p03lecture.p01string;

public class Ex12Split {
	public static void main(String[] args) {
		String str = "java,spring,html,css";

		String[] arr = str.split(",");

		for (String item : arr) {
			System.out.println(item);
		}

		System.out.println("--------------------------------");

		String str2 = "java spring html  css"; // space두개면 잘 쪼개지지 않는다
		String[] arr2 = str2.split(" ");

		for (String item : arr2) {
			System.out.println(item);
		}
		System.out.println(arr2.length); // 5

		System.out.println("--------------------------------");

		String str3 = "java spring html  css"; // space 두개
		String[] arr3 = str3.split(" +"); // space가 한개이상 나타나는것을 체크 - 정규 표현식

		for (String item : arr3) {
			System.out.println(item);
		}
		System.out.println(arr3.length); // 4
	}
}
