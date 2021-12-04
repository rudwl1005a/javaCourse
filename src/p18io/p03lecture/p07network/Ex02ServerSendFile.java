package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02ServerSendFile {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("61.78.142.240", 33333)); // 본인 ip 작성

		System.out.println("연결준비===========");
		Socket socket = serverSocket.accept();

		System.out.println("연결성공===========");
		// file InputStream
		// socket OutputStream

		InputStream is = new FileInputStream("C:\\Users\\com\\Desktop\\course\\iotest\\다운로드.jpg");
		BufferedInputStream bis = new BufferedInputStream(is);

		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);

		System.out.println("파일 전송 시작=====");
		int data = 0;
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}

		System.out.println("파일 전송 완료=====");

		bos.close();
		bis.close();

		socket.close();
		serverSocket.close();
	}
}
