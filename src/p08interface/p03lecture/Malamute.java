package p08interface.p03lecture;

public class Malamute extends KindaDog implements Pet {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}
