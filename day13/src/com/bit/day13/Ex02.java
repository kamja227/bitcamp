package com.bit.day13;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("buffer size: "+ sb1.capacity());
		StringBuffer sb2 = new StringBuffer(3);
		System.out.println("buffer size: "+ sb2.capacity());
		for(int i=0; i<8; i++) { //sb2 5�ϰ� i<6���� �ϸ� sb2.capacity() =12�� �þ //2�辿 �þ
			sb2.append(i);
			System.out.println(sb2 + ":" + sb2.capacity());
		}
		//sb2.delete(7, 8); //������ ���� ����
		
		for(int i=0; i<6; i++) {
			sb2.delete(sb2.length()-1, sb2.length());
			System.out.println(sb2 + ":" + sb2.capacity());
		} //�뷮�� �پ������ ���� 3->8 o 8->3 x
		
		sb2.trimToSize(); // ���־��� ���� ����. Ȯ���� ������ ���� ������ ������ �Ϸ��� buffer�� ����ϴµ� �Ⱦ��� ������ ������ ������ ��ŭ �����ؾ��ؼ� �ӵ��� ���� ��
		System.out.println(sb2 + ":" + sb2.capacity()); //�Ⱦ��� �뷮 ����
		
	
	} // main end
} // Ex02 end
