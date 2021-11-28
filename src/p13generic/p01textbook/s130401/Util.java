package p13generic.p01textbook.s130401;

public class Util {
	// 661 Util, 662 BoxingMethodExample
	// 658 Box
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
