package com.bit.day22;

public class Ex04 extends Thread {

	public static void main(String[] args) {
		
		Thread me = Thread.currentThread(); // 
		System.out.println(me.getName() + " start ... ");
		
		Thread thr = new Thread(){	
			public void run() {
				Thread you = Thread.currentThread();
				System.out.println(you == this); // 실행할 당시 자기자신 스레드
				
				System.out.println(getName() + " start ... ");
				for (int i='A'; i<='Z'; i++) {
					System.out.print((char)i + " ");
				}
				System.out.println("\n" + getName() + " end ...");
			}
		};
		
		thr.start();
		System.out.println("main end ...");
	
	}
}
