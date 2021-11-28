package p11api.p03lecture.p04wrapper;

public class Ex03 {
	public static void main(String[] args) {
		// unboxing
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();
		
		Short s1 = new Short((short) 10013);
		short s2 = s1.shortValue();
		
		Long l1 = new Long(3927492L);
		long l2 = l1.longValue();
		
		Byte b1 = new Byte((byte) 11);
		byte b2 = b1.byteValue();
		
		Float f1 = new Float(3.14F);
		float f2 = f1.floatValue();
		
		Double d1 = new Double(3.14);
		double d2 = d1.doubleValue();
		
		Boolean n1 = new Boolean(true);
		boolean n2 = n1.booleanValue();
		
		Character c1 = new Character('c');
		char c2 = c1.charValue();
	}
}
