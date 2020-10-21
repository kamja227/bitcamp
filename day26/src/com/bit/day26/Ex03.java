package com.bit.day26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		String msg = "문자열 메시지를 작성합니다 \n12345\nABCDEFG";
		// jdk 1.8 ~
		java.io.FileOutputStream os = null;
		
		try(FileOutputStream os1 = new FileOutputStream("test01.txt")){
			os1.write(msg.getBytes());
			os1.flush();
			System.out.println("작성완료...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
