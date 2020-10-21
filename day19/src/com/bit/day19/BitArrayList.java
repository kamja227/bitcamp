package com.bit.day19;

public class BitArrayList {
	// 새로운 데이터가 들어올 때마다 가운데를 기준으로 나눠서 다시 읽어야 하기 때문
	// read 장점
	// insert, update, delete 시 단점
	// 처리효율 떨어짐
	// 열람에는 우수함
	// BitLinkedList 비교
	
	private Object[] arr; 
	
	public BitArrayList() {
		arr = new Object[0]; 
	}
	
	public void add(Object su) { 
		Object[] temp = new Object[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
		arr = temp;
		arr[arr.length-1] = su; // 인덱스번호 마지막
	}
	
	public Object get(int idx) {
		return arr[idx];
	}
	
	public Object size() {
		return arr.length;
	}
		
}

