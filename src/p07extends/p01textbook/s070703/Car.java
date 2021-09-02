package p07extends.p01textbook.s070703;

import p07extends.p01textbook.s070702.Tire;

public class Car {
	Tire[] tires = {
			new Tire(),
			new Tire(),
			new Tire(),
			new Tire()
	};
	
	int run() {
		for (Tire t : tires) {
			t.roll();
		}
		
		return 0;
	}
}
