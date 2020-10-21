package com.bit.day21;

import java.io.File;

public class Ex05 {
	// 파일 이름 변경
	
	public static void main(String[] args) {
		String path = ".\\test03.txt";
		File file = new File(path);
		
		String rename = ".\\test02.txt";
		File file2 = new File(rename);
		
		file.renameTo(file2);
	
	}
}
