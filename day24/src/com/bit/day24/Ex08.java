package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	// IO
	public static void main(String[] args) {
		String path = "data.bin";
		String path2 = "data2.bin";
		File src = new File(path); // �ֱ� input
		File target = new File(path2); // ���� output
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		java.io.BufferedInputStream bis = null;
		java.io.BufferedOutputStream bos = null;
		byte[] buf = new byte[8];
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(target);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int su = bis.read(buf);
				if(su == -1) {break;} 
				bos.write(buf, 0, su);
			}
			bos.flush(); // ������ ä������ ��� ���� �ۼ�
			System.out.println("����Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ��ü ���� �������� close
				if(bis != null) { bis.close(); }
				if(bos != null) { bos.close(); }
 				if(fis != null) { fis.close(); }
				if(fos != null) { fos.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
} 
