package p98programmers;

public class KakaoCodingTest2_202109 {
	public static void main(String[] args) {
		long num = convertN(437674, 3);
//		long num = convertN(110011, 10);
//		long num = convertN(12, 3);
		int answer = 0;
		int length = (int) (Math.log10(num) + 1);
		long tmp = 0;
		int cnt = 0;
		for (int i = 1; i <= length; i++) {
			// num1 : i번째 자리수
			long num1 = (num / ten(i - 1)) % 10;
			System.out.println(num1);
			if (i != length) {
				if (num1 != 0) {
					// tmp : 소수인지 판별할 숫자
					tmp = tmp + num1 * ten(cnt);
					System.out.println("    " + tmp);
					cnt++;
				} else {
					if (prime((int) tmp)) {
						answer++;
					}
					tmp = 0;
					cnt = 0;
				}
			} else {
				tmp = tmp + num1 * ten(cnt);
				System.out.println("    " + tmp);
				if (prime((int) tmp)) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}

	static long convertN(int n, int k) { // 양의정수 n을 k진수로 변경 (단, 3<=k<=10)
		if (n == 0)
			return n % k;
		else
			return (10 * convertN(n / k, k)) + (n % k);
	}

	static boolean prime(int n) { // n이 소수면 true, 아니면 false 반환
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		return cnt == 2 ? true : false;
	}

	static long ten(int k) {
		long num = 1;
		for (int i = 0; i < k; i++) {
			num *= 10;
		}
		return num;
	}
}
