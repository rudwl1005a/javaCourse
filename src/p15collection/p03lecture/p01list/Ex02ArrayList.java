package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex02ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();

		// add

		arr1.add(999);
		arr1.add(888);
		arr1.add(777);

		// size
		System.out.println(arr1.size());

		arr1.add(666);
		arr1.add(555);

		System.out.println(arr1.size());

		System.out.println("--------------------------------");

		// get
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));

		System.out.println("--------------------------------");

		// remove
		arr1.remove(3);
		System.out.println(arr1.size());

		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));

	}
}
