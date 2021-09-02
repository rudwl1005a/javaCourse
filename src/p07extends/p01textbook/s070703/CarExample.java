package p07extends.p01textbook.s070703;

import p07extends.p01textbook.s070702.HankookTire;
import p07extends.p01textbook.s070702.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.tires[0] = new HankookTire();
		car.tires[2] = new KumhoTire();
		
		car.run();
	}
}
