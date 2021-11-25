package p11api.p02quiz;

import java.util.Scanner;

public class Ex04Substring {
	public static void main(String[] args) {
		// 입력한 문자열 반씩 나눠서 출력
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력:");
			String s = scan.next();
			if (s.equals("quit"))
				break;
			System.out.println("앞절반:" + s.substring(0, s.length() / 2));
			System.out.println("뒤절반:" + s.substring(s.length() / 2));
		}

		System.out.println("프로그램 종료");

		scan.close();
	}
}
