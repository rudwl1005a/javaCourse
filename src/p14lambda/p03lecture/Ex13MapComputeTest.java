package p14lambda.p03lecture;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex13MapComputeTest {

	@Test
	void test() {
		Ex13MapCompute e = new Ex13MapCompute();
		
		String s = "keysvalues";
		
		Map<Character, Integer> map = e.count(s);
		
		assertEquals(8, map.size());
		assertEquals(2, map.get('e'));
		assertEquals(2, map.get('s'));
		assertEquals(1, map.get('k'));
		assertEquals(null, map.get('z'));
	}

}
