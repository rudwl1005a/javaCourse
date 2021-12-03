package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {
	public String split(int num) throws Exception {
		String name = "C:\\Users\\com\\Desktop\\course\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas = new char[num];

		String res = "";
		int cnt = 0;
		while ((cnt = fr.read(datas)) != -1) {
			res += new String(datas, 0, cnt) + ",";
		}

		fr.close();
		return res.substring(0, res.length() - 1);
	}
}
