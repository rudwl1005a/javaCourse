package p99codingbat;

public class Warmup1 {
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
