package com.bit.day12;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		String msg2 = "                   java";
		int su = msg.indexOf("Web"); //���� ��
		System.out.println(su);
		String st1 = msg.replace('W', 'a'); // ��� ���� ���� ����
		System.out.println(st1);
		
		char ch = msg.charAt(0);
		boolean boo1 = msg.contains("Web"); // �ִ��� ������
		boolean boo2 = msg.startsWith("Ja"); // Ja�� �����ϴ°�
		boolean boo3 = msg.endsWith("ork"); // ork�� �����°�
		
		String st2 = msg.toLowerCase(); // ���δ� �ҹ��ڷ� �ٲ㼭 ���
		String st3 = msg.toUpperCase(); // ���δ� �빮�ڷ� �ٲ㼭 ���
		
		int lang = msg2.length();
		boolean boo4 = msg2.isEmpty(); // ��������� true
		
		String st4 = msg2.trim(); //�յ� ���� ������
		
		System.out.println(lang);
		System.out.println(boo4);
		
		System.out.println(msg2); //��������
		
		System.out.println(st4); //���鳯��
	}

}
