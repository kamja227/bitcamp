package com.bit.day08;

class Ex04 {
	static int su=1234;   //static일때, non-static일때 결과 차이

	public void plus() {
		su++;
	}

	public void func01() {
		System.out.println("func01 su="+su);
	}

	public static void main(String[] args) {
		Ex04 me=new Ex04();
		//System.out.println(me.su);		
		me.func01();
		me.plus();
		me.func01();
		me.plus();
		me.func01();
		me=new Ex04();
		me.plus();
		me.func01();
	}
} //class emd