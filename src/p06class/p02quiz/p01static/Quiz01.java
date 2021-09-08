package p06class.p02quiz.p01static;

public class Quiz01 {
	public static void main(String[] args) {

		// 원의 넓이를 구하는 식 완성
		// 반지름 * 반지름 * PI
		// java api에서 Math클래스에서 PI라는 static field를 사용

		double a1 = area(10);
		System.out.println(a1);
	}

	public static double area(double r) {
		return r * r * Math.PI;
	}
}
