package p08interface.p02quiz;

import java.util.Arrays;
import java.util.Collections;

public class Example2AnonymousClass {
	public static void main(String[] args) {
		String[] arr = {"java", "bootstrap", "react", "vue", "angular", "jstl", "spring"};
		
		// TODO: z -> a 출력되도록 하세요
		Arrays.sort(arr, Collections.reverseOrder());
		
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		System.out.println(Arrays.toString(arr));
	}
}
