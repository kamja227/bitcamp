package com.bit.day08;

class Ex05 {

	static int a=10; //nonstatic 멤버필드와 메소드

	public static void main(String[] args) {

		int a=1234;
		
		Ex05 me1=new Ex05();
		Ex05 me2=new Ex05();
		System.out.println("me1 a="+Ex05.a); //전역com.bit.day08.Ex05.a
		System.out.println("me2 a="+me2.a);  //지역 

		me1.a++;
		System.out.println("me1의 a++");
		System.out.println("me1 a="+me1.a);
		System.out.println("me2 a="+me2.a);	
	}
} //class end