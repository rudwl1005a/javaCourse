package p10exception.p03lecture.p07custom;

public class ImageNotFoundException extends RuntimeException {
	// 1. RuntimeException (unchecked)
	// 2. Exception (checked)

	// 보통 "String message 파라미터"를 받는 생성자를 만듦

	public ImageNotFoundException() {

	}

	public ImageNotFoundException(String message) {
		super(message);
	}

}
