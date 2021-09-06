package p08interface.p03lecture;

public class Example2 {
	public static void main(String[] args) {
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
	}
}
