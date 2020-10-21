package com.bit.day12;

public class Ex04 {

	public static void main(String[] args) {
		String msg = "2";
		int[] arr = new int[10]; // arr

		try {
			int su = Integer.parseInt(msg); // 숫자로 바꿈
			double su2 = 10.0 / su;

			arr[su] = (int) su2; // arr

			System.out.println("10/" + msg + "=" + su2);

		} catch (Exception e) {
			System.out.println("에러를 회피했습니다");
		}
	}

}
