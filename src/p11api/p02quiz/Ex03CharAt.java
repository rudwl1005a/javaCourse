package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {
		// 입력한 문자열의 가운데 글자를 출력
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력:");
			String s = scan.next();
			if (s.equals("quit"))
				break;
			int mid = s.length() / 2;
			System.out.println("가운데 글자는 " + s.charAt(mid));
		}

		System.out.println("프로그램 종료");

		scan.close();
	}
}
