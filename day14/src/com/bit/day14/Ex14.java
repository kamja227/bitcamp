package com.bit.day14;

public class Ex14 {

	public static void main(String[] args) {
		java.io.InputStream inn = System.in;
		
		String msg = "java\nweb\nframework";
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(msg);
		System.out.println(sc.nextLine()); //���� ������ �о��� 
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		
		System.out.println(sc.next()); // ����, ���� ���� ���� �ܾ� �ν�
	}

}
