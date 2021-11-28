package p13generic.p03lecture.p02generic;

public class Ex01 {
	public static void main(String[] args) {
		Box<String> b1;
		Box<Integer> b2;
		
		b1 = new Box<String>();
		b2 = new Box<Integer>();
		
//		b1.setItem(33); // x
//		b2.setItem("java"); // x
		
		b1.setItem("java");
		b2.setItem(333);
		
		String s = b1.getItem();
		Integer i = b2.getItem();
		
		System.out.println(s.length());
		System.out.println(i.intValue());
	}
}

class Box<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
}
