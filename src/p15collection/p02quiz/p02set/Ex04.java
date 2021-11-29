package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
	public Set<String> dupSet(String[] arr) {
		Set<String> set = new HashSet<>();
		Set<String> result = new HashSet<>();

		for (String str : arr) {

			if (set.contains(str)) {
				result.add(str);
			} else {
				set.add(str);
			}

		}

		return result;
	}
}
