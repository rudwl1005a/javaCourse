package p15collection.p03lecture.p02set;

import java.util.TreeSet;

public class Ex05TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");

		for (String str : ts) {
			System.out.println(str);
		}
	}
}
