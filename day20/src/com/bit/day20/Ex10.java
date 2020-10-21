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
//		Lec10<Integer> lec = new Lec10<Integer>(); // int�� ��ü�ڷ���(Integer) ���, �⺻���� �ȵ�
		Lec10<Double, String> lec = new Lec10<Double, String>();
		
//		lec.setSu(1234); // ���� int��� type missmatch�� ���׸����� �ذ�
		lec.setSu(3.14);
		lec.setMsg("Hello");

//		lec.setMsg(new StringBuffer("Hello"));
			
		System.out.println(lec.getSu());
		System.out.println(lec.getMsg());
	}
}
