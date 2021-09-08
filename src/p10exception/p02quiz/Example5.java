package p10exception.p02quiz;

public class Example5 {
	// ArrayIndexOutOfBoundsException 발생시키는 코드

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

//		System.out.println(arr[3]);

		// 또는

		throw new ArrayIndexOutOfBoundsException();
	}
}
