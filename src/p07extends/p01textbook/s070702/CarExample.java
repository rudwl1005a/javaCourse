package p07extends.p01textbook.s070702;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.backLeftTire = new HankookTire();
		car.frontLeftTire = new KumhoTire();
		
		car.run();
	}
}
