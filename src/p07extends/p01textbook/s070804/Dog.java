package p07extends.p01textbook.s070804;

public class Dog extends Animal {

	// 부모클래스에 추상메서드가 있다면 자식클래스에서 필수로 재정의 해야줘야함

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
