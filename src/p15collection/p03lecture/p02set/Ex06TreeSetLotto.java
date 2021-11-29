package p15collection.p03lecture.p02set;

import java.util.Random;
import java.util.TreeSet;

public class Ex06TreeSetLotto {
	public static void main(String[] args) {

		TreeSet<Integer> lotto = new TreeSet<>();

		Random r = new Random();

		while (true) {
			int rn = r.nextInt(45) + 1;
			lotto.add(rn);
			if (lotto.size() == 6) {
				break;
			}
		}

		System.out.println(lotto);
	}
}
