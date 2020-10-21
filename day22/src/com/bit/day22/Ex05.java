package com.bit.day22;

public class Ex05 {

	public static void main(String[] args) {
		
		Runnable work = new Runnable() {
			public void run() {
				Thread me = Thread.currentThread();
				System.out.println(me.getName() + " start");
				
				for(int i=0; i<50; i++) {
					System.out.println(me.getName() + " work" + i);
				}
				
				System.out.println(me.getName() + " end");
			}
		};
		
		Thread thr1 = new Thread(work, "ù��°");
		Thread thr2 = new Thread(work, "�ι�°");
		Thread thr3 = new Thread(work, "����°");

//		thr1.setPriority(1); 
//		thr2.setPriority(2);
//		thr3.setPriority(10); // ����� ���� num29
		// setPriority - �켱���� (1~10) Max-10 Min-1

		thr1.setPriority(Thread.MIN_PRIORITY); // 1 
		thr2.setPriority(Thread.NORM_PRIORITY); // 5
		thr3.setPriority(Thread.MAX_PRIORITY); // 10
		
		thr1.start();
		thr2.start();
		thr3.start();
	}
}
