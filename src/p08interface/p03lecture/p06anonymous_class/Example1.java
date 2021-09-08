package p08interface.p03lecture.p06anonymous_class;

public class Example1 {
//	MyInterface1 i1 = new MyInterface1(); // x
	MyInterface1 i2 = new MyClass1(); // o

	// 클래스와 인스턴스(객체)를 한 번에 만들 수 있음
	MyInterface1 i3 = new MyInterface1() {

	}; // o
}
