package p08interface.p03lecture.p02default_method;

public class Cat implements Pet {

	@Override
	public void sit() {
		System.out.println("무시합니다.");
	}
}