package com.bit.day26;

class Lec08 extends Thread {
	int tot;
	
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.println(i + "를 더합니다");
				tot += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify(); // wait 중 하나만 깨움 runnable상태
			notifyAll(); // 전부 runnable
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Lec08 lec = new Lec08();
		lec.start();
		synchronized (lec) {
			try {
				lec.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("tot : " + lec.tot);
	}
}
