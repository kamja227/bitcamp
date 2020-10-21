package com.bit.day14;

public class Ex15 {
//java.util package
	
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		
		System.out.println(arr1.toString());		
		System.out.println(java.util.Arrays.toString(arr1)); //반복문을 쓰지 않고 배열 확인
		
		//배열의 깊은복사 방법
		//1 길이 지정 가능
//		int[] arr2 = new int[arr1.length];
//		for(int i=0; i<arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		System.out.println(java.util.Arrays.toString(arr2));
		
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(java.util.Arrays.toString(arr2));
		
		//2 길이 지정 가능
//		int[] arr3 = new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		int[] arr3 = new int[2];
		System.arraycopy(arr1, 1, arr3, 0, 2);
		
		//3 길이 지정 불가능
//		int[] arr4 = java.util.Arrays.copyOf(arr1, arr1.length);
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(java.util.Arrays.toString(arr4));
		
		//오름차순 정렬
		int[] rans = {41, 2, 23, 10, 11, 28};
		java.util.Arrays.sort(rans); ////////////////////////////////
		System.out.println(java.util.Arrays.toString(rans)); //오름차순 정렬
		System.out.println(java.util.Arrays.binarySearch(rans, 28)); //sort하지 않으면 이상한 값 나올 수 있음
		
	}
}
