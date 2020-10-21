package com.bit.day26;

public class Ex06 extends Thread {
// ����ȭ
		static int sum;
		int begin;
		int end;
		Object key;
		
		public Ex06(int begin, int end, Object key2) {
			this.begin = begin;
			this.end = end;
			this.key  = key2;
		}
		
		public void sum(int i) {
			sum += i+1;
			System.out.println();
		}
		
//		// ������ȭ
//		// �����Ǵ� ���� ��
//		public void sum(int i) {
////			sum = i+1;
//			int hap = i+1;
//			synchronized(key) {
//				sum = sum + hap;
//			}
//		}
		
//		//�޼ҵ� ����ȭ
//		public static synchronized void sum(int i) { 
//			int hap = i+1;
//			sum = sum + hap;
//		}
		
		@Override
		public void run() {
			for(int i = begin; i<end; i++) sum(i);
		}
		
		public static void main(String[] args) {
		// 1 ~ 10000 ������ �հ踦 ���Ͻÿ�
		// 1 ~ 5000 ������ �հ踦 ���Ͻÿ�
		// 5000 ~ 10000 ������ �հ�	�� ���Ͻÿ�
		
			int sum = 0; 
			for(int i=0; i<50; i++) sum += i+1;
			for(int i=50; i<100; i++) sum += i+1;
			System.out.println("1~10000 ������ �հ� : " + sum);
			
			Object key = new Object();
			Ex06 me = new Ex06(0, 50, key);
			Ex06 you = new Ex06(50, 100, key);
			me.start();
			you.start();
			try {
				me.join();
				you.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("me+you : " + Ex06.sum);
			
	}
}
