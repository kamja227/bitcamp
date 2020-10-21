package com.bit.day12;

public class Ex03 {
	public static void main(String[] args) {
		String msg = "4";
		int[] arr = new int[10]; // arr

		try {
			int su = Integer.parseInt(msg); // 숫자로 바꿈
			double su2 = 10.0 / su;

			arr[su] = (int) su2; // arr

			System.out.println("10/" + msg + "=" + su2);

		} catch (NumberFormatException e) {
			System.out.println("숫자로만 입력하세요");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열의 인덱스가 범위 밖으로 호출하였습니다");
		}
	}
}
