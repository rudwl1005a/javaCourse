package p11api.p03lecture.p04wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// boxing
		int i1 = 300;
		Integer i2 = new Integer(i1);

		// auto boxing
		int i3 = 500;
		Integer i4 = i3;
		Integer i5 = 700;

		byte b1 = 100;
		Byte b2 = b1;
		Byte b3 = 100;

		long l1 = 329874293497L;
		Long l2 = l1;
		Long l3 = 32987429842L;

		short s1 = 13413;
		Short s2 = s1;
		Short s3 = 3111;

		float f1 = 3.14F;
		Float f2 = f1;
		Float f3 = 2342.2414F;

		double d1 = 3.14;
		Double d2 = d1;
		Double d3 = 2342341.14134143;

		boolean n1 = true;
		Boolean n2 = n1;
		Boolean n3 = false;

		char c1 = 'c';
		Character c2 = c1;
		Character c3 = 'd';

//		Integer i6 = 300;
//		System.out.println(i6 + 100);
	}
}
