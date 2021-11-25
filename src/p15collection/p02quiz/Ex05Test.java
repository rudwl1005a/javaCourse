package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex05Test {

	@Test
	void test() {
		Ex05 e = new Ex05();

		assertEquals(7, e.sum("3 4"));
		assertEquals(43, e.sum("10 33"));
		assertEquals(0, e.sum("-5 5"));
	}

}
