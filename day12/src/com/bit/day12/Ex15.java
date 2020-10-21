package com.bit.day12;

public class Ex15 {
	public static void main(String[] args) {
		String msg1 = "abcd";
		String msg2 = "abcd";
		String msg3 = "abc";
		String msg4 = "abcadfsdfjkl";
		
		System.out.println(msg1.compareTo(msg2)); // 같으면 0
		System.out.println(msg1.compareTo(msg3)); // abc까지는 같아서 길이의 차이값이 나옴
		System.out.println(msg1.compareTo(msg4)); // d와 a의 차이
		
		//compareTo로 길이의 차이, 달라진 값 알 수 있게 됨
	}
}
