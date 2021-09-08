package p10exception.p02quiz;

public class Example6 {
	// ClassCastException 발생시키는 코드

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Cat cat = (Cat) animal;

		// 또는

		throw new ClassCastException();
	}

	public static class Animal {
	}

	public static class Dog extends Animal {
	}

	public static class Cat extends Animal {
	}
}
