package com.bit.web;

import java.io.*;
import java.net.*;

public class Server01 {
	
	public static void main(String[] args) {
	
		int port = 80;
		ServerSocket serv = null;
		Socket sock = null;
		OutputStream os = null;
		PrintStream ps = null;
		
		try {
			serv = new ServerSocket(port);
			sock = serv.accept();
			os = sock.getOutputStream();
			ps = new PrintStream(os);
			
			ps.println("HTTP/1.1 200 OK \r\n");
			for(int i=0; i<5; i++) {
				ps.println("<h1>print " + i + ".......</h1>");
			}
			ps.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(os != null) os.close();
				if(sock != null) sock.close();
				if(serv != null) serv.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main end
} // class end
