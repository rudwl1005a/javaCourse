package p18io.p02quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\com\\Desktop\\course\\iotest\\outtest9.txt"; // 원본파일
		String des = "C:\\Users\\com\\Desktop\\course\\iotest\\outtestB.txt"; // 대상파일
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);

		// 원본내용
		// springjavaspringring

		// 대상파일 내용
		// irpsajgnpsavgnirgnir

		char[] datas = new char[4];

		while (rd.read(datas) != -1) {
			// reverse datas
			reverse(datas);
			wr.write(datas);
		}
		rd.close();
		wr.close();

		System.out.println("done");
	}

	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length - 1;

		while (left < right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;

			left++;
			right--;
		}
	}
}
