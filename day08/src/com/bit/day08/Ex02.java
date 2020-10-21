package com.bit.day08;

class Ex02 {
	static int su1;
	static String msg; 
	//변수를 초기화 하지 않음
	//자바는 null과 undefine을 구별하지 않음 . 다 null임

	public static void main(String[] args) {
		System.out.println(su1); //0
		System.out.println(msg); //null
	}

	public void func02() {
		System.out.println(su1);
	}

	public static void func01() {
		System.out.println(su1);
	}
} //class end	