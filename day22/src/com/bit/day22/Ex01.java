package com.bit.day22;

public class Ex01 extends Thread {
	//������
	public void run() {
		System.out.println("thread start ... ");
		
		for(int i=0; i<10; i++) {
			System.out.println("thread work ... ");
		}
		
		System.out.println("thread end ...");
	}
	
	public static void main(String[] args) {
		System.out.println("main start ... ");
		Ex01 me = new Ex01();
//		me.run(); // ���� �۾� // ���ο� Thread ����� �� �ƴ϶� run�� ����
		me.start(); // ��Ƽ �۾� // ���ο� Thread ���� // �Ϲ������� ���� ������ Thread �ߵ�
		/*
		 * ex) ���� 1 - ���� 1/3 â 1/3 ĳ�� 1/3 �ƴ�
		 * 			���� 1/2 â 1/2 ĳ�� 1/2 �� ���� �Ҷ����� �ٲ㰡�� ����ǹǷ�
		 * 			������ ���� ������ ���� 
		 */
 		
		for(int i=0; i<5; i++) {
			String temp = new String("test" + i);
			System.out.println("main work ...");
		}
		System.out.println("main end ...");
	}
}
