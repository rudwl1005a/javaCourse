package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex03ClientDownloadFile {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();

		System.out.println("연결 시도+++++++++");
		socket.connect(new InetSocketAddress("61.78.142.240", 33333)); // 본인 컴퓨터 ip

		System.out.println("연결 성공+++++++++");

		// socket InputStream
		// file OutputStream

		OutputStream os = new FileOutputStream("C:\\Users\\com\\Desktop\\course\\iotest\\서버.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);

		// 파일 받기
		System.out.println("파일 받기 시작+++++");
		int data = 0;
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}

		System.out.println("파일 받기 완료+++++");

		bis.close();
		bos.close();
		socket.close();
	}
}
