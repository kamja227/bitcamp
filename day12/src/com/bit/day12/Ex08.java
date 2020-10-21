package com.bit.day12;

public class Ex08 {

	public static void main(String[] args) {
		try {
			int[] arr={1,2,3,4,5};
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러회피");
		}
	}

}
