package com.bit.day12;

public class Ex16 {

	public static void main(String[] args) {
		String msg1="java";
		String msg2="db";
		String msg3="aa";
		String msg = "java DB web framework"; //띄어쓰기를 포함한 문장
		
		String[] arr = msg.split(" "); // spilit으로 띄어쓰기를 구분하여 배열에 저장
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr[2]);
	}

}
