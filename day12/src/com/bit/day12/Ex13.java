package com.bit.day12;

public class Ex13 {

	public static void main(String[] args) {
		// String class
		String msg1 = "java";
		String msg2 = "web";
		
		String msg3 = msg1.concat(msg2);
		//System.out.println(msg3); // javaweb
		
		String msg4="JavaWebSpringa"; 
		
		String msg5 = msg3.substring(4); // 인덱스번호 부터
		String msg6 = msg4.substring(4,7); // 해당 인덱스부터 인덱스까지
										// substring(a, b)  a = 01234 b = msg4의 뒤에서부터 1234567
		String msg7 = msg4.substring(0,4); // Java
		String msg8 = msg4.substring(4,msg4.length()); // (4,13) 과 같음
		
		String msg9 = msg4.replace("Web","DB");
		String msg10 = msg4.replace("Web","");
		String msg11 = msg4.replace("W","w");
		String msg12 = msg4.replace("Java", "");
		
		char ch = msg4.charAt(0); // 인덱스에 해당하는 문자
		System.out.println(ch);
		int idx = msg4.indexOf('W'); // 문자에 해당하는 인덱스
		idx = msg4.indexOf("a"); //먼저 나오는 a
		idx = msg4.indexOf("a", 2);
	
		
		String msg13 = msg4.substring(0,msg4.indexOf("Web")); //msg4.indexOf("Web") == 4
		
		String msg14 = msg4.substring(msg4.indexOf("Web") + "Web".length());
		String msg15 = msg4.replace("a", "A"); //모든 a 다바뀜
		
		System.out.println(msg13 + "DB" + msg14);
		System.out.println(msg15);
	}

}
