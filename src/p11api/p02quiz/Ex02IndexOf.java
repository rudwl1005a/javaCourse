package p11api.p02quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		// "공장"이 있는 index들을 전부 출력해라.
		// 출력결과 : 3 6 13 22 25 32

		for (int i = 0; i < str.length();) {
			if (str.indexOf("공장", i) > 0) {
				System.out.print(str.indexOf("공장", i) + " ");
				i = str.indexOf("공장", i) + 1;
			} else
				i++;
		}
	}
}
