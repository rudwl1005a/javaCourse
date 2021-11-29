package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("0:종료,1:출력,2:삭제,3:통계 점수(50이상)>");
			int input = scanner.nextInt();

			switch (input) {
			case 0:
				run = false;
				break;
			case 1:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			case 2:
				if (list.size() > 0) {
					list.remove(list.size() - 1);
				}
				break;
			case 3:
				int sum = 0;
				for (Integer item : list) {
					sum = sum + item;// int <---> Integer
				}

				double avg = sum / (double) list.size();

				int max = max(list);
				int min = min(list);

				System.out.println("합계:" + sum);
				System.out.println("평균:" + avg);
				System.out.println("최대값:" + max);
				System.out.println("최소값:" + min);
				break;

			default:
				if (input >= 50) {
					list.add(input);
				}
				break;
			}
		}

		scanner.close();
	}

	private static int min(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int item : list) {
			min = Math.min(min, item);
		}

		return min;

	}

	private static int max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}

		int max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		return max;
	}
}
