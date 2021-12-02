package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		
		System.out.println(arr1);
		
		// ArrayList.removeIf
		// 코드 작성
		arr1.removeIf(e -> e % 2 == 0);
		
		// 익명클래스 객체
		arr1.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		});
		
		// lambda 
		arr1.removeIf((Integer item) -> {
			return item % 2 == 0;
		});
		
		// lambda : 하나의 명령문 {}중괄호 생략, return 생략
		arr1.removeIf((Integer item) -> item % 2 == 0);
		
		// lambda : 파라미터 type 생략
		arr1.removeIf((e) -> e % 2 == 0);
		
		// lambda : 파라미터 ()소괄호 생략 
		arr1.removeIf(e -> e % 2 == 0);
		
		
		System.out.println(arr1); // [3, 5]
	}
}











