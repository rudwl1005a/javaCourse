package p07extends.p01textbook.s070802;

public class Example {
	public static void main(String[] args) {
//		Phone p1 = new Phone();
		Phone p2 = new TelePhone();
		Phone p3 = new SmartPhone();
		
		p2.turnOn();
//		p2.autoAnswering();
		
		p3.turnOn();
//		p3.internetSearch();
		
		// p2변수의 값을 이용해서 autoAnswering 실행
		// p3변수의 값을 이용해서 internetSearch 실행
		
	}
}


