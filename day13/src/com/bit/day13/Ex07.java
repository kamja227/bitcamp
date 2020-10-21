package com.bit.day13;

public class Ex07 {
	static Ex07 ex = new Ex07();
	
	public void func01() {}
	
	public static void main(String[] args) {
		long begin =System.currentTimeMillis();
		
		System.out.println(System.currentTimeMillis()); // 1/1000초 기준일로부터 millisecond초 만큼 흐름 기준일:january 1, 1970 UTC.
		System.out.println("출력");
		//return;
		//System.exit(1); // jvm을 죽임 (자바가상머신)
		
		int[] origin = {1,3,5,7,9};
		int[] dest = new int[5];
		
//		for(int i=0; i<orgin.length; i++) {
//			dest[i] = orgin[i]; //깊은복사
//		}
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(origin, 1, dest, 1, 3);
		
		for(int i=0; i<dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("main 수행시간 : " + (end-begin) + "ms");
	}
}
