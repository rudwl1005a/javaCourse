package p07extends.p01textbook.s070802;

public class Example {
	public static void main(String[] args) {
//		Phone p1 = new Phone();
		Phone p2 = new Telephone();
		Phone p3 = new SmartPhone();

		p2.turnOn();
//		p2.autoAnswering();	// phone입장에서는 없다

		p3.turnOn();
//		p3.internetSearch(); // phone입장에서는 없다

		// p2변수의 값을 이용해서 autoAnswering 실행
		// p3변수의 값을 이용해서 internetSearch 실행
		System.out.println("-----------------------------");
		// 강제형변환
		Telephone t1 = (Telephone) p2;
		SmartPhone s1 = (SmartPhone) p3;

		t1.autoAnswering();
		s1.internetSearch();

		System.out.println("-----------다른버전------------");
		((Telephone) p2).autoAnswering();
		((SmartPhone) p3).internetSearch();

	}
}
