package p07extends.p01textbook.s070702;

public class Car {

	Tire frontLeftTire = new Tire();
	Tire frontRightTire = new Tire();
	Tire backLeftTire = new Tire();
	Tire backRightTire = new Tire();
	
	int run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		return 0;
	}
}
