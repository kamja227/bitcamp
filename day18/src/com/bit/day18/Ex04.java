package com.bit.day18;

class List {
	Object[] arr;

	List() {
		arr = new Object[0];
	}
	public void add(Object a) {
		Object[] temp = new Object[arr.length+1];
		// ������
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		// �ű�
		temp[temp.length-1] = a;
		arr = temp;
	}
	public int size(){
		return arr.length;
	}
	public int get(int idx){
		return arr.length;
	}
 }


public class Ex04 {
	public static void main(Object[] args) {
		// �ڷᱸ�� ��ü ����
		List list = new List();
		list.add('#');
		list.add(true);
		list.add(1234);
		list.add(3.14);
		list.add("abcde");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}