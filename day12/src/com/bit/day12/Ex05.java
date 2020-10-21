package com.bit.day12;

public class Ex05 {

	public static void main(String[] args) {
		String msg = "a"; // String 클래스도 package있음 java lang(guage)패키지만 별도로 명쇄하지 않아도 쓸 수 있음 

		int[] arr = { 1, 2, 3, 4, 5 };
		try {

			int su = Integer.parseInt(msg);
			System.out.println(arr[su]);

		} catch (NumberFormatException e) {
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (Exception e) {
		}

	}

}

// 부모일수록 아래로 (catch 나중에)