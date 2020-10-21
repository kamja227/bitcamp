package com.bit.day20;
//Ex08

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex12 {
	
	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
//		ArrayList<Number> list = new ArrayList<Number>();
		
		link.add(1111);
		link.add(2222);
		ArrayList<Number> list = new ArrayList<Number>(link);
	
		Number[] arr = null;
		Number[] result = list.toArray(arr);

	}
}
