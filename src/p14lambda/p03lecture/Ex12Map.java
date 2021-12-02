package p14lambda.p03lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Ex12Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);

		// forEach
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		// key:1인 value는 10이므로 v=10 -> v=100
		map.compute(1, (k, v) -> v * 10);
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		// key:4인 값이 없으므로 v는 null
		map.compute(4, (k, v) -> v);
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		// key:4의 정보 확인 / null이면 key값을 10배한 값을 value에 저장
		map.compute(4, (k, v) -> {
			System.out.println("메소드 시작");

			System.out.println(k);
			System.out.println(v);

			System.out.println("메소드 종료");

			return v == null ? k * 10 : v * 10;
		});

		// forEach 탐색
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		// 정리
		map.compute(4, (k, v) -> v == null ? k * 10 : v * 10);
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		// 풀어씀
		map.compute(5, new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return u == null ? t * 10 : u * 10;
			}
		});
		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}