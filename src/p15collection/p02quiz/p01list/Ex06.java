package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex06 {
	public int max(List<Integer> list) {

		int max = list.get(0);

		for (int item : list) {
			max = (max < item) ? item : max;
		}

		return max;
	}
}
