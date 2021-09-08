package p10exception.p02quiz;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 수 입력:");
			String str1 = scanner.next();

			System.out.print("두번째 수 입력:");
			String str2 = scanner.next();

			try {
				int n1 = Integer.parseInt(str1);
				int n2 = Integer.parseInt(str2);

				System.out.println("더한 결과는: " + (n1 + n2));
			} catch (NumberFormatException e) {
				System.out.println("잘못된 숫자를 입력했습니다.");
				break;
			}
		}

		scanner.close();
	}
}
