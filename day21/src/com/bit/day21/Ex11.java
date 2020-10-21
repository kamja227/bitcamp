package com.bit.day21;

public class Ex11 {

	public static void main(String[] args) {
		// finally
		boolean boo = true;
		try {
			int[] arr = {1, 3, 5};
			System.out.println(arr[3]);
			if(boo) {
				return;
			}
//			System.out.println("수고하셨습니다"); // 에러가 나도 나와야함
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러회피");
		
		} finally {
			System.out.println("수고하셨습니다");
			// 반드시 수행함
		}
	}
}
