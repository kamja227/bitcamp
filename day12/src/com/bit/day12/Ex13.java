package com.bit.day12;

public class Ex13 {

	public static void main(String[] args) {
		// String class
		String msg1 = "java";
		String msg2 = "web";
		
		String msg3 = msg1.concat(msg2);
		//System.out.println(msg3); // javaweb
		
		String msg4="JavaWebSpringa"; 
		
		String msg5 = msg3.substring(4); // �ε�����ȣ ����
		String msg6 = msg4.substring(4,7); // �ش� �ε������� �ε�������
										// substring(a, b)  a = 01234 b = msg4�� �ڿ������� 1234567
		String msg7 = msg4.substring(0,4); // Java
		String msg8 = msg4.substring(4,msg4.length()); // (4,13) �� ����
		
		String msg9 = msg4.replace("Web","DB");
		String msg10 = msg4.replace("Web","");
		String msg11 = msg4.replace("W","w");
		String msg12 = msg4.replace("Java", "");
		
		char ch = msg4.charAt(0); // �ε����� �ش��ϴ� ����
		System.out.println(ch);
		int idx = msg4.indexOf('W'); // ���ڿ� �ش��ϴ� �ε���
		idx = msg4.indexOf("a"); //���� ������ a
		idx = msg4.indexOf("a", 2);
	
		
		String msg13 = msg4.substring(0,msg4.indexOf("Web")); //msg4.indexOf("Web") == 4
		
		String msg14 = msg4.substring(msg4.indexOf("Web") + "Web".length());
		String msg15 = msg4.replace("a", "A"); //��� a �ٹٲ�
		
		System.out.println(msg13 + "DB" + msg14);
		System.out.println(msg15);
	}

}
