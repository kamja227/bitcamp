package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
	
		String ip = "192.168.0.171"; // ������ ����, ����ip localhost
		// ~2000 ������ ��ӵ� port��ȣ 
		int port = 8080;
		java.net.Socket sock = null;
		java.io.InputStream is = null;
		java.io.InputStreamReader isr = null;
		java.io.OutputStream os = null;
		
		try {
			sock = new Socket(ip, port);
			System.out.println("Client : ������ ������");
			String msg = "������";
			os = sock.getOutputStream();
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			os.flush();
			int su = -1;
			
			while((su = isr.read()) != -1) {
				os.write(System.in.read());
				System.out.println((char)su);
				System.out.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) isr.close();
				if(os != null) os.close();
				if(is != null) is.close();
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
