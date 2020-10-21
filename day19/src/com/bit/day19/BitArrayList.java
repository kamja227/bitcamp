package com.bit.day19;

public class BitArrayList {
	// ���ο� �����Ͱ� ���� ������ ����� �������� ������ �ٽ� �о�� �ϱ� ����
	// read ����
	// insert, update, delete �� ����
	// ó��ȿ�� ������
	// �������� �����
	// BitLinkedList ��
	
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
		arr[arr.length-1] = su; // �ε�����ȣ ������
	}
	
	public Object get(int idx) {
		return arr[idx];
	}
	
	public Object size() {
		return arr.length;
	}
		
}

