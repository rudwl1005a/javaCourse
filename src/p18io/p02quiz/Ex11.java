package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestD.txt";

		// 사용자로부터 입력 받은 내용을
		// 파일에 작성하기

		// 입력:오늘 점심은 돈까스
		// 입력:내일은 짜장면
		// 입력:exit
		// exit라고 입력받으면 종료

		// 파일
		// 오늘 점심은 돈까스
		// 내일은 짜장면

		Scanner scanner = new Scanner(System.in);
		Writer writer = new FileWriter(name);

		String input = null;
		boolean run = true;
		while (run) {
			System.out.print("입력:");
			input = scanner.nextLine();

			if (input.equals("exit")) {
				break;
			}

			writer.write(input);
			writer.write("\n");
			writer.flush();
		}

		System.out.println("프로그램 종료");
		writer.close();
		scanner.close();
	}
}
