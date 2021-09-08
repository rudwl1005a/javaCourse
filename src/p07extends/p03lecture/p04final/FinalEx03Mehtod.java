package p07extends.p03lecture.p04final;

public class FinalEx03Mehtod {

}

class Car {
	public final void start() {
		System.out.println("출발");
	}
}

class Tesla extends Car {
	// final 메서드는 재정의를 할 수 없다
//	public void start() {
//		System.out.println("테슬라 출발");
//	}
}
