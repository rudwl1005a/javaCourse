package p13generic.p03lecture.p03wildcard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3, 4, 5, 6, 5, 4, 3, 2, 1);
		List<Double> list2 = Arrays.asList(3.3, 4.4, 5.5, 6.6, 5.5, 4.4, 3.3, 2.2, 1.1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		MyComparator c = new MyComparator();
		
		list1.sort(c);
		list2.sort(c);
		
		System.out.println(list1);
		System.out.println(list2);
	}
}

class MyComparator implements Comparator<Number> {
	@Override
	public int compare(Number o1, Number o2) {
		// o1이 o2보다 크면 양수
		// o1이 o2보다 작으면 음수
		// 같으면 0;
		
		
		return - (int) (o1.doubleValue() - o2.doubleValue());
	}
}
