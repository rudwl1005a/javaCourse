package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex03Test {

	@Test
	void test() {
		assertEquals(0, 0);
		assertEquals(1, 1);
		assertEquals(3.14, 3.14);
		assertEquals(3.14, 3.12); // failure

		Ex03 e = new Ex03();
		assertEquals(0, e.triple(0));
		assertEquals(9, e.triple(3));
	}

}
