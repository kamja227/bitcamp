package com.bit.day12;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		String msg2 = "                   java";
		int su = msg.indexOf("Web"); //많이 씀
		System.out.println(su);
		String st1 = msg.replace('W', 'a'); // 없어도 오류 뜨지 않음
		System.out.println(st1);
		
		char ch = msg.charAt(0);
		boolean boo1 = msg.contains("Web"); // 있는지 없는지
		boolean boo2 = msg.startsWith("Ja"); // Ja로 시작하는가
		boolean boo3 = msg.endsWith("ork"); // ork로 끝나는가
		
		String st2 = msg.toLowerCase(); // 전부다 소문자로 바꿔서 출력
		String st3 = msg.toUpperCase(); // 전부다 대문자로 바꿔서 출력
		
		int lang = msg2.length();
		boolean boo4 = msg2.isEmpty(); // 비어있으면 true
		
		String st4 = msg2.trim(); //앞뒤 공백 날려줌
		
		System.out.println(lang);
		System.out.println(boo4);
		
		System.out.println(msg2); //공백있음
		
		System.out.println(st4); //공백날림
	}

}
