package p06class.p03lecture.p01static;

public class StaticEx01Field {
	public static void main(String[] args) {

		Class01.id = 3; // id값에 직접 접근이 가능해서 같은 값을 공유한다
		System.out.println(Class01.id);

		Class01 c1 = new Class01();
		Class01 c2 = new Class01();

		System.out.println(c1.id);
		System.out.println(c2.id);
	}
}

class Class01 {
	int isf; // instance field

	// static field
	// (정적 멤버 변수, 정적 필드, 스태틱 필드, 스태틱 변수)
	// (클래스 변수)
	static int id;
}
