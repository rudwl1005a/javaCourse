package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex04Test {

	@Test
	void test() {
		Ex04 e = new Ex04();
		assertEquals(0, e.remainder(0));
		assertEquals(2, e.remainder(12));
	}

}
