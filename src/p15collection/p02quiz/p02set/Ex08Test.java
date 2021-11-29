package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

class Ex08Test {

	@Test
	void test() {
		Ex08 e = new Ex08();
		
		Set<Integer> set1 = e.diff(new int[] {1, 2, 3}, new int[] {2, 3, 4});
		assertEquals(1, set1.size());
		assertTrue(set1.contains(1));
		assertFalse(set1.contains(2));
		assertFalse(set1.contains(3));
		assertFalse(set1.contains(4));
		
		Set<Integer> set2 = e.diff2(new int[] {1, 2, 3}, new int[] {2, 3, 4});
		assertEquals(1, set2.size());
		assertTrue(set2.contains(1));
		assertFalse(set2.contains(2));
		assertFalse(set2.contains(3));
		assertFalse(set2.contains(4));
	}

}
