package com.bit.day12;

public class Ex16 {

	public static void main(String[] args) {
		String msg1="java";
		String msg2="db";
		String msg3="aa";
		String msg = "java DB web framework"; //���⸦ ������ ����
		
		String[] arr = msg.split(" "); // spilit���� ���⸦ �����Ͽ� �迭�� ����
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr[2]);
	}

}
