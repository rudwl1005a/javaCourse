package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	// scanner, loop를 사용하여 입력받은 문자열이 몇글자인지 출력하는 코드작성
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력:");
			String s = scan.next();
			if (s.equals("quit"))
				break;
			System.out.println(s.length() + "글자입니다.");
		}

		System.out.println("프로그램 종료");

		scan.close();
	}
}
