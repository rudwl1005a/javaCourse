package p01review;

public class C04ReferenceType {
	public static void main(String[] args) {
		Tesla t1 = new Tesla();
		Audi a1 = new Audi();
		Car c1 = t1;
		c1 = a1;
		
		c1.setSpeed(100);
		
		System.out.println(t1.getSpeed());
		
		t1.autoControl();
//		c1.autoControl();
	}
}

class Car {
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}

class Tesla extends Car {
	
	public void autoControl() {
		System.out.println("자동 운전");
	}
}

class Audi extends Car {
	
}









