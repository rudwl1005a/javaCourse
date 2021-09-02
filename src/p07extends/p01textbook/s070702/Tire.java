package p07extends.p01textbook.s070702;

public class Tire {

	public int accumulatedRotation;
	public int maxRotation;

	public boolean roll() {
		System.out.println("Tire 수명...");
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			return true;
		} else {
			return false;
		}
	}
}
