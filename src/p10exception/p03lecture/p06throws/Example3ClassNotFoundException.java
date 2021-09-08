package p10exception.p03lecture.p06throws;

public class Example3ClassNotFoundException {
	public static void main(String[] args) {

		try {
			Class.forName("aaaa"); // ClassNotFoundException을 던진다(Throws)
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 사용해서 힌트 얻어라
		}

	}
}
