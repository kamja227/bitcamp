package com.bit.day14;

public class Ex15 {
//java.util package
	
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		
		System.out.println(arr1.toString());		
		System.out.println(java.util.Arrays.toString(arr1)); //�ݺ����� ���� �ʰ� �迭 Ȯ��
		
		//�迭�� �������� ���
		//1 ���� ���� ����
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
		
		//2 ���� ���� ����
//		int[] arr3 = new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		int[] arr3 = new int[2];
		System.arraycopy(arr1, 1, arr3, 0, 2);
		
		//3 ���� ���� �Ұ���
//		int[] arr4 = java.util.Arrays.copyOf(arr1, arr1.length);
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(java.util.Arrays.toString(arr4));
		
		//�������� ����
		int[] rans = {41, 2, 23, 10, 11, 28};
		java.util.Arrays.sort(rans); ////////////////////////////////
		System.out.println(java.util.Arrays.toString(rans)); //�������� ����
		System.out.println(java.util.Arrays.binarySearch(rans, 28)); //sort���� ������ �̻��� �� ���� �� ����
		
	}
}
