package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
//		Math.random();
		// 1~45사이의 값 6개 랜덤
		ArrayList<Integer> lotto = new ArrayList<>();
		
		// 코드작성
		while (lotto.size() < 6) {
			int ran = (int) (Math.random() * 45) + 1;
			
			System.out.println(ran);
			
			if (!lotto.contains(ran)) {
				lotto.add(ran);
			}
		}
		
		System.out.println("===========================");
		
		for (int l : lotto) {
			System.out.println(l); // 6개 랜덤(중복 허용xxxx)
		}
	}
}
