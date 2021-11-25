package p15collection.p02quiz;

import java.util.Scanner;

public class Ex05 {
	public int sum(String str) {
		// str: "3 4"
		// return: 3+4
		String[] sArr = str.split(" ");

		return Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]);
	}

	// sum과 동일하게 작동
	public int sum2(String str) {
		Scanner scan = new Scanner(str);

		return scan.nextInt() + scan.nextInt();
	}
}
