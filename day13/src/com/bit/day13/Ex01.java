package com.bit.day13;

public class Ex01 {

	public static void main(String[] args) {
		String msg1 = new String("JavaWebFramework");
		StringBuffer sb1 = new StringBuffer("JavaWebFramework");
//		StringBuffer sb2 = "";
		StringBuilder sb3 = new StringBuilder(); //StringBuffer와 같음
		StringBuffer sb4 = new StringBuffer(10);
		
		
		System.out.println(msg1.length());
		System.out.println(sb1.length());
		
		//문자열 삽입, (보기), 수정, 삭제 CRUD
		
		StringBuffer sb5 = new StringBuffer("Java");
		StringBuffer sb6 = new StringBuffer("Web");
		//StringBuffer sb7 = sb5 + sb6;  // 안됨
		StringBuffer sb7 = sb5.append(sb6); // concat append //sb5+sb6을 하고 sb5에 저장됨 //sb5.append(sb6) 만 해도 됨
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
		
		
		//String 은 출력 할때마다 새로운 객체가 찍힘
	}

}
