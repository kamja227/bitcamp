package com.bit.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class UdpReceiver {

	
	public static void main(String[] args) {
		int port = 8080;
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		byte[] buf = new byte[5];
		
		try {
			
			// 1차
			sock = new DatagramSocket(8080);
			pack = new DatagramPacket(buf, 5);
			System.out.println("1차 : receive 대기중 ...");
			sock.receive(pack);
			System.out.println("1차 : receive 받음 ... ");
			byte[] data = pack.getData();
			System.out.println(new String(data));
			
			///2차
			System.out.println("2차 대기중 ...");
			pack = new DatagramPacket(buf, 4);
			sock.receive(pack);
			System.out.println("2차 받음 ... ");
			byte[] data2 = pack.getData();
			System.out.println(new String(data2));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock != null) sock.close();
		}
	}
}
