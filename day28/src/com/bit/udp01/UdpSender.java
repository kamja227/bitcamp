package com.bit.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSender {

	public static void main(String[] args) {
		String msg = "Hello";
		
		byte[] ip = {(byte)192, (byte)168, (byte)0, (byte)171}; // String ip = "192.168.0.171";
		int port = 8080;
		
		java.net.DatagramSocket sock = null;
		java.net.DatagramPacket pack = null;
		
		try {
			sock = new java.net.DatagramSocket();
			InetAddress addr = InetAddress.getByAddress(ip);
			/// 1차
			pack = new DatagramPacket(msg.getBytes(), msg.length(), addr, port);
			sock.send(pack);
			/// 2차
			pack = new DatagramPacket("한글".getBytes(), 4, addr, port);
			sock.send(pack);

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock != null) sock.close();
		}
	}
}
