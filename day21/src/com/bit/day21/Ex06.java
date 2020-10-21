package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	// 임시저장파일
	// 파일명, 확장자 필요
	public static void main(String[] args){
		String prefix = "AABBCCDDEEFFGG";
		String suffix = ".txt";
		try {
			File file = File.createTempFile(prefix, suffix); // 특정 위치에 저장이 아닌 임시 저장
			System.out.println(file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
