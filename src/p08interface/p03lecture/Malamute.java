package p08interface.p03lecture;

public class Malamute extends KindaDog implements Pet {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void sit() {
		System.out.println("자리에 앉습니다.");
	}
}
