package com.bit.day26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		String msg = "���ڿ� �޽����� �ۼ��մϴ� \n12345\nABCDEFG";
		// jdk 1.8 ~
		java.io.FileOutputStream os = null;
		
		try(FileOutputStream os1 = new FileOutputStream("test01.txt")){
			os1.write(msg.getBytes());
			os1.flush();
			System.out.println("�ۼ��Ϸ�...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
