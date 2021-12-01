package p14lambda.p03lecture;

public class Ex01Anonymous {
	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = new MyClass1(); // 객체생성
		
		// interface 구현과 객체생성 한 번에
		MyInterface1 o2 = new MyInterface1() {
			@Override
			public void method1() {
			}
			@Override
			public void method2() {
			}
			
			
		};
	}
}

interface MyInterface1 {
	public void method1();
	public void method2();
}

class MyClass1 implements MyInterface1 {
	// interface 구현
	
	// 추상 메소드 재정의
	@Override
	public void method1() {
	}
	@Override
	public void method2() {
	}
}
