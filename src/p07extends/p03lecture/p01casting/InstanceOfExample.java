package p07extends.p03lecture.p01casting;

public class InstanceOfExample {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();

		if (a1 instanceof Cat) { // 정상출력
			Cat c1 = (Cat) a1;
			c1.punch();
		}

		if (a2 instanceof Cat) { // 출력되지 않음 - a2 != Cat이기 때문이다.
			Cat c2 = (Cat) a2;
			c2.punch();
		}

		System.out.println("프로그램 정상 종료.");
	}
}
