package com.bit.day08;

public class Ex01{
	//클래스의 구성요소
	// 1.메서드
	// 2.변수
		
	public static int a; //클래스변수, 전역변수
	int b; //멤버필드, 인스턴스변수
		
	public void func() {
		a=1;

		System.out.println("a="+a);	
	}
	public static void main(String[] args) {
		Ex01 me=new Ex01();
		me.func();
	}
}