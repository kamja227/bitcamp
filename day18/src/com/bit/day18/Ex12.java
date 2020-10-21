package com.bit.day18;

class Lec05 { 
	void func01() {
		class Inner {
			void func02() {
				System.out.println("로컬클래스의 기능");
			}	
		};
	}
	void func03() {
		// 익명클래스
		new Local() {
			public void func22() {
				System.out.println("로컬클래스의 기능");
			}
		}.func22();
	}
	
	Local func04() {
		class Inner implements Local{
			public void func22() {
				System.out.println("로컬클래스의 기능");
			}
		};
		return new Inner();
	}
}

interface Local {
	void func22();
}

public class Ex12 {
	void func01(){};
	
	public static void main(String[] args) {
		new Ex12() {
			public void func01() {
				System.out.println("익명클래스");
			}
		}.func01();
	}
}
