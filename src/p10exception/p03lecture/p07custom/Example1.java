package p10exception.p03lecture.p07custom;

public class Example1 {
	public static void main(String[] args) {
//		String s = getImage("cat"); // 오류!
		// -> imageNotFound 오류처리를 만들고 싶은데 이미 만들어져 있는 예외는 없다.
		// custom exception을 만들어서 처리

		try {
			String s = getImage("cat");
			System.out.println("찾은 이미지: " + s);
			System.out.println("프로그램 종료");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

	private static String getImage(String name) {
		String[] images = { "dog", "lion" };

		for (String image : images) {
			if (image.equals(name)) {
				return image;
			}
		}

		throw new ImageNotFoundException(name + "를 찾으려고 했음.");
	}
}
