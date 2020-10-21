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
			
			// 1��
			sock = new DatagramSocket(8080);
			pack = new DatagramPacket(buf, 5);
			System.out.println("1�� : receive ����� ...");
			sock.receive(pack);
			System.out.println("1�� : receive ���� ... ");
			byte[] data = pack.getData();
			System.out.println(new String(data));
			
			///2��
			System.out.println("2�� ����� ...");
			pack = new DatagramPacket(buf, 4);
			sock.receive(pack);
			System.out.println("2�� ���� ... ");
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
