package com.bit.day18;

import com.bit.day18.Lec03.Lec33;

//2. 인스턴스 클래스, 멤버 클래스 (non-static)
//Ex10

class Lec03 {
	static int su1 = 1111;
	int su2 = 2222;
	
	class Lec33 {
//		static int su3 = 3333;
		static final int su5 =5555; //static안되지만 예외는 있음
		int su4 = 4444;
		
		Lec33(){}
	
//		static void func03(){}
		void func04(){
			System.out.println(su1);
			func01();
			Lec03 lec03 = new Lec03();
//			System.out.println(lec03.su2);
//			lec03.func02();
			System.out.println(su2);
			func02(); // 상속처럼 씀
		}
		
	}
	
	Lec03(){} // 생성자
	
	static void func01(){
		Lec03 me = new Lec03();
		Lec33 lec33 = me.new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();
	}
	void func02(){
		Lec33 lec33 = new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();
	}
	
}
public class Ex10 {
	public static void main(String[] args) {
		Lec03 outter = new Lec03();
		Lec03.Lec33 inner = outter.new Lec33();
		System.out.println(inner.su4);
		System.out.println(inner.su5);
		inner.func04();
		
	}
	
}
