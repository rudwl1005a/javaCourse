package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ex10Test {

	@Test
	void test() {
		Ex10 e = new Ex10();
		// list의 짝수 아이템들만 모은 새 ArrayList를 만들어서 리턴

		List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 9, 10, 10, 9, 8));
		// [8 9 10 10 9 8] -> [8 10 10 8]
		ArrayList<Integer> r1 = e.evenList(list1);
		assertEquals(4, r1.size()); // 새로 만들어진 list의 size가 4가 맞는지
		assertEquals(8, r1.get(0)); // 첫번째 원소가 8인지
		assertEquals(10, r1.get(1)); // 두번째 원소가 10인지
		assertEquals(10, r1.get(2)); // 세번째 원소가 10인지
		assertEquals(8, r1.get(3)); // 네번째 원소가 8인지 확인
		assertEquals(6, list1.size()); // 원래 list의 크기가 6인지 확인

		List<Integer> list2 = new ArrayList<>(Arrays.asList(-1, -2, -3, -100, -200, -1));
		// [-1 -2 -3 -100 -200 -1] -> [-2 -100 -200]
		ArrayList<Integer> r2 = e.evenList(list2);
		assertEquals(3, r2.size());
		assertEquals(6, list2.size());

		List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 9, 8, 100, 1, 2, 3));
		// [10 9 8 100 1 2 3] -> [10 8 100 2]
		ArrayList<Integer> r3 = e.evenList(list3);
		assertEquals(4, r3.size());
		assertEquals(7, list3.size());
	}

}