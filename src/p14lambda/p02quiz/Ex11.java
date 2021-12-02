package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(6, 7, 2, 4, 1);
		List<String> list2 = Arrays.asList("java", "a", "spring", "qa", "mouse", "bob");

		System.out.println(list1);
		// 1. list.sort를 이용하여 리스트 안의 element를 오름차순으로 정렬
		list1.sort((a, b) -> a - b); // [1, 2, 4, 6, 7]

		System.out.println(list1);

		// 참고 - 내림차순으로 정렬
		list1.sort((a, b) -> b - a); // [7, 6, 4, 2, 1]

		System.out.println(list1);

		System.out.println(list2);
		// 2. list.sort를 이용하여 리스트안의 element의 길이를 기준으로 오름차순으로 정렬
		list2.sort((s1, s2) -> s1.length() - s2.length());

		System.out.println(list2); // [a, qa, bob, java, mouse, spring]
	}
}