package p07extends.p03lecture.p04final;

public class FinalEx01Variable {

	public static void main(String[] args) {
		// 변수에 final이 붙으면 값을 할당 받는 기회가 단 한번이다.
		final int var1 = 100;
		System.out.println(var1);

//		var1 = 10; // 오류!
		System.out.println(var1);

		method2(3);
		method2(33);
	}

	public static void method2(final int param) {
//		param = 5;	// 실수로 적은 코드 -> final을 써서 방지
		System.out.println(param);
	}
}
