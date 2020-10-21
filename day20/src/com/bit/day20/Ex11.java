package com.bit.day20;

import java.util.ArrayList;

class Lec1<T> {
	T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
	void func(java.util.List<? extends Number> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
} // Lec1 end

public class Ex11 {
	
	public static void main(String[] args) {
//		list.add("abc");
//		list.add("defg");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Lec1 lec = new Lec1();
		lec.func(list);
		
		Lec1< ? extends Integer> lec1 = new Lec1<>();
		
		// 와일드타입
		//<? super Number> Number 기준 위로
		//<? extends Number> Number 기준 아래로
		
//		Lec1<String> lec1 = new Lec1<String>();
//		Lec1<Number> lec1 = new Lec1<>();
//		Lec1<String> lec2 = (Lec1<String>) lec1;
//		lec1.setObj(1234);
//		Object msg = lec1.getObj();
//		System.out.println(lec1.getObj());		
	
	} // main end
} // Ex11 end
