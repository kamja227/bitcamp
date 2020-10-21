package com.bit.day12;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("main start...");
		for (int i=0; i<5; i++) {
			try {
				func01(i);
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("main end...");
	}
	
	public static void func01(int a) {
		System.out.println("에러발생전");
		int[] arr = {1,2,3,4,5};
		try {
			System.out.println(arr[a]);
			System.out.println("에러발생안함");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("스스로 해결함");
		}
	}
}

	
	//try catch 있을 때 없을 때
	//없으면 호출한 쪽으로 돌아감..?