package p07extends.p01textbook.exercises;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		// 1번 : 같은 코드 run이 실행된다 o
		// 2번 : 서로 다른 코드가 실행될 수도 있다. x
	}
}
