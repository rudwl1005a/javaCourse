package p99codingbat;

public class Warmup1 {

	public String notString2(String str) {
		if (str.startsWith("not")) {
			return str;
		}

		return "not " + str;
	}

	public String notString(String str) {
		int len = str.length();

		if (len >= 3) {
			char c1 = str.charAt(0);
			char c2 = str.charAt(1);
			char c3 = str.charAt(2);

			if (c1 == 'n' && c2 == 'o' && c3 == 't') {
				return str;
			}
		}

		return "not " + str;
	}

	public boolean makes10(int a, int b) {
		if (a == 10) {
			return true;
		}

		if (b == 10) {
			return true;
		}

		if ((a + b) == 10) {
			return true;
		}

		return false;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		if (n > 21) {
			return (n - 21) * 2;
		} else {
			return 21 - n;
		}
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		/*
		 * boolean result = !weekday || vacation;
		 * 
		 * return result;
		 */

		return !weekday || vacation;

	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		return aSmile == bSmile;
	}

	public int sumDouble(int a, int b) {

		if (a != b) {
			return a + b;
		} else {
			return (a + b) * 2;
		}

	}

}
