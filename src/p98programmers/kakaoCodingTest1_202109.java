package p98programmers;

import java.util.Arrays;

public class kakaoCodingTest1_202109 {
	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		int[] reportNum = new int[id_list.length];
		int[] answer = new int[id_list.length];
		int[][] checkReport = new int[id_list.length][id_list.length];
		String user = "";
		String reported = "";
		int userNum = 0;
		int reportedNum = 0;

		for (int i = 0; i < report.length; i++) {
			int sprit = report[i].indexOf(" ");
			user = report[i].substring(0, sprit);
			reported = report[i].substring(sprit + 1);
			for (int j = 0; j < id_list.length; j++) {
				if (user.equals(id_list[j]))
					userNum = j;
				if (reported.equals(id_list[j]))
					reportedNum = j;
			}
			if (checkReport[userNum][reportedNum] == 0) {
				checkReport[userNum][reportedNum]++;
			}
		}
		for (int i = 0; i < id_list.length; i++) {
			for (int j = 0; j < id_list.length; j++) {
				reportNum[i] += checkReport[j][i];
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			if (reportNum[i] >= k) {
				for (int j = 0; j < id_list.length; j++) {
					if (checkReport[j][i] == 1) {
						answer[j]++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(answer));

	}
}
