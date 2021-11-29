package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public Map<Character, Integer> countCharacter(String str) {
		// str의 문자가 몇번 나오는지 세어서
		// 문자를 key 몇번을 value 로 갖는 map 만들어서 return
		
		Map<Character, Integer> result = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			
			if (result.containsKey(c)) {
				Integer v = result.get(c);
				result.put(c, v + 1);
			} else {
				result.put(c, 1);
			}
		}
		
		return result;
	}
}
