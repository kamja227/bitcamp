package com.bit.day13;

public class Ex01 {

	public static void main(String[] args) {
		String msg1 = new String("JavaWebFramework");
		StringBuffer sb1 = new StringBuffer("JavaWebFramework");
//		StringBuffer sb2 = "";
		StringBuilder sb3 = new StringBuilder(); //StringBuffer�� ����
		StringBuffer sb4 = new StringBuffer(10);
		
		
		System.out.println(msg1.length());
		System.out.println(sb1.length());
		
		//���ڿ� ����, (����), ����, ���� CRUD
		
		StringBuffer sb5 = new StringBuffer("Java");
		StringBuffer sb6 = new StringBuffer("Web");
		//StringBuffer sb7 = sb5 + sb6;  // �ȵ�
		StringBuffer sb7 = sb5.append(sb6); // concat append //sb5+sb6�� �ϰ� sb5�� ����� //sb5.append(sb6) �� �ص� ��
		//StringBuffer msg2 = "sb7="+sb7;
		
		
		System.out.println("sb7=" + sb7);
		System.out.println("sb5=" + sb5);
		System.out.println("sb6=" + sb6);
		
		String msg2 = "java";
		String msg3 = "web";
		String msg4 = msg2 + msg3;
	
		System.out.println("String msg4"+msg4);
		System.out.println("String msg2"+msg2);
		System.out.println("String msg3"+msg3);
		
		System.out.println(sb5); // JavaWeb
		sb5.delete(4, 7); //sb5.delete(start, end
		System.out.println(sb5); //Java
		sb5.insert(4, "Web");
		System.out.println(sb5);
		sb5.insert(sb5.length(), "Framework");
		System.out.println(sb5);
		sb5.replace(4, 6, "Database n");
		System.out.println(sb5);
		
		
		//String �� ��� �Ҷ����� ���ο� ��ü�� ����
	}

}
