package p98programmers;

import java.util.*;

class Solution42576Collection {
	public String solution(String[] participant, String[] completion) {

		Map<String, Integer> com = new HashMap<>();

		for (String c : completion) {
			if (com.containsKey(c)) {
				int count = com.get(c);
				com.put(c, count + 1);
			} else {
				com.put(c, 1);
			}
		}

		for (String p : participant) {
			if (com.containsKey(p)) {
				int count = com.get(p);
				if (count == 0) {
					return p;
				} else {
					com.put(p, count - 1);
				}
			} else {
				return p;
			}
		}

		return null;
	}
}