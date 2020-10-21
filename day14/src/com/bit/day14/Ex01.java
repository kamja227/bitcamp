 package com.bit.day14;

abstract class Lec01 {
	public abstract void func01();
}

class Lec11 extends Lec01 {
	public void func01() {
		System.out.println("구현했음");
	}
}


public abstract class Ex01 { //abstract있으면 추상클래스 있음
	//추상클래스
	// - 추상메서드를 0개 이상 갖는 클래스 //0개인 이유 : 추상메서드를 갖지 않는 추상클래스도 존재
	// - 추상메서드 - 메서드의 선언(0), 구현(x)
	
	
	//public abstract void func01(); //;포함

	public static void main(String[] args) {
	
		Lec11 lec = new Lec11();
		lec.func01();
		
	}
}
