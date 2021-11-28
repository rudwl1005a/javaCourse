package p13generic.p03lecture.p04extends;

public class Ex01 {
	public static void main(String[] args) {
		Child3Type t3 = new Child3Type();
		t3.method("hello");
	}
}	

class MyType<T> {
	public void method(T param) {
		
	}
	
}

class ChildType<T> extends MyType<T> {
	
}

class Child2Type<T, U> extends MyType<T> {
	public void method1(U param) {
		
	}
}

class Child3Type extends MyType<String> {
	
}
