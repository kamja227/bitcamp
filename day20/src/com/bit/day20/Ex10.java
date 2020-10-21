package com.bit.day20;

class Lec10<T, V> {
	T su;
	V msg;
	
	void setSu(T su) {
		this.su = su;
	}
	void setMsg(V msg) {
		this.msg = msg;
	}
	T getSu() {
		return su;
	}
	V getMsg() {
		return msg;
	}
}

public class Ex10 {

	public static void main(String[] args) {
//		Lec10<Integer> lec = new Lec10<Integer>(); // int의 객체자료형(Integer) 사용, 기본형은 안됨
		Lec10<Double, String> lec = new Lec10<Double, String>();
		
//		lec.setSu(1234); // 원래 int였어서 type missmatch를 제네릭으로 해결
		lec.setSu(3.14);
		lec.setMsg("Hello");

//		lec.setMsg(new StringBuffer("Hello"));
			
		System.out.println(lec.getSu());
		System.out.println(lec.getMsg());
	}
}
