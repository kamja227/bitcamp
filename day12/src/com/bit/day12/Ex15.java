package com.bit.day12;

public class Ex15 {
	public static void main(String[] args) {
		String msg1 = "abcd";
		String msg2 = "abcd";
		String msg3 = "abc";
		String msg4 = "abcadfsdfjkl";
		
		System.out.println(msg1.compareTo(msg2)); // ������ 0
		System.out.println(msg1.compareTo(msg3)); // abc������ ���Ƽ� ������ ���̰��� ����
		System.out.println(msg1.compareTo(msg4)); // d�� a�� ����
		
		//compareTo�� ������ ����, �޶��� �� �� �� �ְ� ��
	}
}
