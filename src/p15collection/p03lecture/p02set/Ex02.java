package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<Integer> set;
//		set = new Set<>(); // interface여서 instance 만들 수 없음
		set = new HashSet<>();
		
		set.add(3);
		set.add(33);
		set.add(6);
		
		int size = set.size();
		System.out.println(size);
		
		set.add(33); // 존재하지 않을 때만 추가
		
		System.out.println(set.size());
		
		/* index 로 아이템 접근 불가
		for (int i = 0; i < set.size(); i++) {
			set.get(i);
		}
		*/
		
		System.out.println("-아이템 탐색");
		// 향상된 for
		for (int item : set) {
			System.out.println(item);
		}
		
		System.out.println("-아이템 검색");
		boolean b = set.contains(3);
		System.out.println(b);
		System.out.println(set.contains(5));
		
		System.out.println("-아이템 삭제");
		set.remove(3);
		System.out.println(set.size());
		set.remove(5);
		System.out.println(set.size());
	}
}













