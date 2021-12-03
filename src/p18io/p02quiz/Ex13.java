package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		String src = "src/p18io/p02quiz/Ex13.java";
		String des = "C:\\Users\\com\\Desktop\\course\\iotest\\Ex13.java";

		// src -> des
		// 라인넘버를 앞에 붙여서

		FileReader fr = new FileReader(src);
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter(des);
		BufferedWriter bw = new BufferedWriter(fw);

		String line = null;
		int num = 0;

		while ((line = br.readLine()) != null) {
			num++;

			bw.write(num + ":" + line);
			bw.newLine();
		}

		br.close();
//		fr.close();

		bw.close();
//		fw.close();
	}
}
