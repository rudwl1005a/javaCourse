package p98programmers;

public class Solution72410 {
	public static void main(String[] args) {
		String str = "...!@BaT#*..y.abcdefghijklm";
		String str2 = "z-+.^.";
		String str3 = "=.=";
		String str4 = "123_.def";
		String str5 = "abcdefghijklmn.p";
		System.out.println(solution(str));
		System.out.println(solution(str2));
		System.out.println(solution(str3));
		System.out.println(solution(str4));
		System.out.println(solution(str5));
	}

	public static String solution(String new_id) {
		String answer = "";

		// 1단계
		answer = new_id.toLowerCase();

		// 2단계
		for (int i = 0; i < answer.length();) {
			if (answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z'
					|| answer.charAt(i) >= '0' && answer.charAt(i) <= '9') {
				i++;
			} else if (answer.charAt(i) == '-') {
				i++;
			} else if (answer.charAt(i) == '_') {
				i++;
			} else if (answer.charAt(i) == '.') {
				i++;
			} else {
				String str1 = answer.substring(0, i);
				String str2 = answer.substring(i + 1);
				answer = str1 + str2;
			}
		}

		// 3단계
		for (int i = 0; i < answer.length();) {
			if (answer.charAt(i) == '.' && i != answer.length() - 1) {
				if (answer.charAt(i + 1) == '.') {
					String str1 = answer.substring(0, i);
					String str2 = answer.substring(i + 1);
					answer = str1 + str2;
				} else
					i++;
			} else
				i++;
		}

		// 4단계
		if (!answer.equals("")) {
			if (answer.charAt(0) == '.')
				answer = answer.substring(1);
		}
		if (!answer.equals("")) {
			if (answer.charAt(answer.length() - 1) == '.')
				answer = answer.substring(0, answer.length() - 1);
		}

		// 5단계
		if (answer.equals(""))
			answer = "a";

		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}
		if (!answer.equals("")) {
			if (answer.charAt(answer.length() - 1) == '.')
				answer = answer.substring(0, answer.length() - 1);
		}

		// 7단계
		if (answer.length() == 1) {
			answer += answer + answer;
		} else if (answer.length() == 2) {
			answer += answer.substring(1);
		}

		return answer;
	}

}
