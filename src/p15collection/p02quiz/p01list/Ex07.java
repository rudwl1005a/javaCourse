package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex07 {
	public int maxIndex(List<Integer> list) {
		// 최대값이 있는 인덱스를 리턴
		
		int index = 0;
		int max = list.get(0);
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}
		
		return index;
	}
}
