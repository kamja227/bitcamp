package com.bit.day21;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		String path = ".";
		File file= new File(path);
		
		if(file.exists()) { // 파일이 존재하는지
			String[] temp = file.list();
			String[] dirs = new String[temp.length + 2];
			dirs[0] = ".";
			dirs[1] = "..";
			System.arraycopy(temp, 0, dirs, 2, temp.length);
			
			for(int i=0; i<dirs.length; i++) {
				String filename = dirs[i];
				
				File f = new File(filename);
				long time = f.lastModified();
				Date day = new Date(time);
				
				SimpleDateFormat sdf = new SimpleDateFormat();
				sdf.applyPattern("YYYY-MM-dd");
				String msg = sdf.format(day);
				System.out.println(msg + "\t");
				if(f.isDirectory()) {
					System.out.print("<DIR>\t");
				} else {
					System.out.print("\t" + f.length());
				}
			}
 		} else {
 			System.out.println("err");
 		}
	}
}
