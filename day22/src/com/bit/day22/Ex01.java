package com.bit.day22;

public class Ex01 extends Thread {
	//스레드
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
//		me.run(); // 단일 작업 // 새로운 Thread 만드는 게 아니라 run을 실행
		me.start(); // 멀티 작업 // 새로운 Thread 만듬 // 일반적으로 메인 끝나고 Thread 발동
		/*
		 * ex) 게임 1 - 음악 1/3 창 1/3 캐릭 1/3 아님
		 * 			음악 1/2 창 1/2 캐릭 1/2 로 실행 할때마다 바꿔가며 실행되므로
		 * 			일정한 값이 나오지 않음 
		 */
 		
		for(int i=0; i<5; i++) {
			String temp = new String("test" + i);
			System.out.println("main work ...");
		}
		System.out.println("main end ...");
	}
}
