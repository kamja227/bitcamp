package com.bit.day21;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	// �ӽ���������
	// ���ϸ�, Ȯ���� �ʿ�
	public static void main(String[] args){
		String prefix = "AABBCCDDEEFFGG";
		String suffix = ".txt";
		try {
			File file = File.createTempFile(prefix, suffix); // Ư�� ��ġ�� ������ �ƴ� �ӽ� ����
			System.out.println(file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
