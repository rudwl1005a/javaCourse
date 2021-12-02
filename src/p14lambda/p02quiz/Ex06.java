package p14lambda.p02quiz;

import java.util.HashMap;
import java.util.Map;

public class Ex06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("lang", "java");
		map.put("fw", "spring");
		map.put("fe", "html");

		/*
		 * key:lang, value:java
		 * key:fw, value:spring
		 * key:fe, value:html
		 */
		// map의 foreach 활용
		map.forEach((key, val) -> System.out.println("key:" + key + ", value:" + val));
	}
}
