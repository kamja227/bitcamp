package com.bit.day08;

class Ex03 {
	static int a;
	
	public static void func01() {
		System.out.println("a="+a);		
	}
	
	public static void func02() {
		int b=a;
		System.out.println("b="+b);
	}

	public static void main(String[] args) {
		int a=10;
		func01();
		func02();		
	}

} //class end		