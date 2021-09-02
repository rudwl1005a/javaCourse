package p99codingbat;

public class Warmup1 {
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
