package com.bit.web01;

import java.io.*;
import java.net.*;

public class Server extends Thread {
	Socket sock;
	
	public Server(Socket sock) {
		this.sock = sock;
	}
	
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		FileInputStream fis = null;
		File file = null;
		
		try {
			SocketAddress addr = sock.getRemoteSocketAddress();
//			java.net.InetAddress iaddr = (IntAddress)addr;
			System.out.println(addr.toString());
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String request = br.readLine();
//			System.out.println(request);
			String[] arr = request.split(" ");
//			file = new File("www/hangle.txt");
			if(arr[1].equals("/")) {
				arr[1] = "/index.html";
			} // 요청이 없을 때..?
				
			file = new File("www" + arr[1]);
			os = sock.getOutputStream();	
			
			///////////////////////////////////////////////////
			os.write("HTTP/1.1 200 OK\r\n".getBytes()); // http 요청 성공 코드 200 OK
			os.write("Content-type: text/html; charset = utf-8 \r\n".getBytes()); // 한글 파일 utf-8 로 바꾸기
			os.write("\r\n".getBytes()); // 본문과 해더 정보의 구분
//			os.write("<h1>Hello world ...</h1>".getBytes());
			
			fis = new FileInputStream(file);
			int su = -1;
			while((su=fis.read()) != -1) {
				os.write(su);
			}
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(os != null) os.close();
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // run end
	
	public static void main(String[] args) {
		int port = 8080;
		ServerSocket serv = null;
		
		try {
			System.out.println("서버 실행 중");
			serv = new ServerSocket(port);
			while(true) { // 종료되지 않게 계속
				Socket sock = serv.accept(); // 접속이 들어오면 연결된 소켓을 이용해서 io작업 할 수 있게
				Server thr = new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serv != null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	} // main end
} // class end
