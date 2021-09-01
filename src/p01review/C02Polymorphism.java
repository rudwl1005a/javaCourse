package p01review;

public class C02Polymorphism {
	// 다형성
	
	// 1.상위 타입으로 자동 변환(값 할당)
	// 2.실행되는 메소드는 실제 인스턴스의 메소드
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		a1.cry();
		c1.cry();
		d1.cry();
		
		System.out.println("========================");
		
		Animal a2 = c1;
		Animal a3 = d1;
		
		a2.cry();
		a3.cry();
		
		// Cat c2 = a1;
		// Dog d2 = a1;
	}
}

class Animal {
	
	public void cry() {
		System.out.println("동물이 웁니다.");
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("고양이가 웁니다.");
	}
}

class Dog extends Animal {
	
}









