package p11api.p02quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력문자열:");
		String input = scanner.nextLine();

		System.out.print("구분자:");
		String dm = scanner.nextLine();

		// 코드 작성
		String[] strings = input.split(dm);

		// 출력 첫번째 방법
//		for (String item : strings) {
//			System.out.println(item);
//		}
		// 출력 두번째 방법
		System.out.println(Arrays.toString(strings));

		scanner.close();
	}
}
///*****
// 입력문자열:java,spring,css
// 구분자:,
// java
// spring
// css
//
// 입력문자열:22222-22222-22222-22222
// 구분자:-
// 22222
// 22222
// 22222
// 22222
//
// 입력문자열:ab cd ef gh
// 구분자: 
// ab
// cd
// ef
// gh
// *******/