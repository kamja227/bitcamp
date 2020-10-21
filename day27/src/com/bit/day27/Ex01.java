package com.bit.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	
	public static void main(String[] args) {

		String url = "www.naver.com"; // c class
		String url2 = "naver.com"; // a class
		String url3 = "localhost";
		java.net.InetAddress addr01 = null;
		InetAddress[] all = null;
		try {
			addr01 = InetAddress.getByName(url);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getHostAddress());
			System.out.println("-----------------------------------");
			
			addr01 = InetAddress.getByName(url2);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getHostAddress());
			System.out.println("-----------------------------------");
			
			addr01 = InetAddress.getByName(url3);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getHostAddress());
			System.out.println("-----------------------------------");
			
			///////////////////////////////////////////////
			
			
			all = addr01.getAllByName(url);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<all.length; i++) {
			System.out.println(all[i].getHostAddress());
		}
	}
}
