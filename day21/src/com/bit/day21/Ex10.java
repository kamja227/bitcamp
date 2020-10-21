package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {
	// C:\\Users\\bitmap\\Pictures\\a.png 사진 day21\copy에 복사
	
	public static void main(String[] args) {
	
		String path1 = "C:\\Users\\bitmap\\Pictures\\a.png";
		File source = new File(path1);
		FileInputStream fis = null;
		
		String path2 = ".\\copy\\copy.png"; // copy폴더에 copy.png
		File target = new File(path2);
		FileOutputStream fos = null;
		File par = new File(target.getParent());		
		par.mkdir();
		try {
				if(target.exists()) {target.createNewFile();}
				fis = new FileInputStream(source);
				fos = new FileOutputStream(target);
				
				while(true) {
					int su = fis.read();
					if(su == -1) {break;}
					fos.write(su);
				}
				System.out.println("복사끝");
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {fis.close();}
				if(fos != null) {fos.close();}
			} catch (IOException e) {
				e.printStackTrace();				
			}
		}
	}	
}
