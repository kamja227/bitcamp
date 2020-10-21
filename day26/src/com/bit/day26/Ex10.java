package com.bit.day26;

public class Ex10 extends Thread{
	boolean running;
	boolean end = true;
	int cnt;
	
	public void run() {
//		for(int i=0; i<5; i++) {
		while(end) {
			cnt++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(running) {
				if("Tread-0".equals(getName())) {
					if(cnt<20) {
						Thread.yield(); // 양보
					}
				}
				System.out.println(getName() + "출력" + cnt);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		Ex10 you = new Ex10();
		me.start();
		
//		you.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running = true;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running = false;
	}
}
