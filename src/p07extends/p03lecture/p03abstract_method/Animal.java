package p07extends.p03lecture.p03abstract_method;

public abstract class Animal {

	// 추상 메서드가 있는 클래스는 반드시 추상 클래스이어야 합니다.

	public abstract void cry(); // 추상 메서드(몸통이 없는 메서드) -> 코드를 작성할 필요가 없거나 할 수 없을때 사용

	public void walk() { // 기본 메서드도 사용 가능
		System.out.println("네발로 걷습니다.");
	}
}
