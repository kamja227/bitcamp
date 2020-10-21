package com.bit.day13;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("buffer size: "+ sb1.capacity());
		StringBuffer sb2 = new StringBuffer(3);
		System.out.println("buffer size: "+ sb2.capacity());
		for(int i=0; i<8; i++) { //sb2 5하고 i<6까지 하면 sb2.capacity() =12로 늘어남 //2배씩 늘어남
			sb2.append(i);
			System.out.println(sb2 + ":" + sb2.capacity());
		}
		//sb2.delete(7, 8); //마지막 글자 지움
		
		for(int i=0; i<6; i++) {
			sb2.delete(sb2.length()-1, sb2.length());
			System.out.println(sb2 + ":" + sb2.capacity());
		} //용량이 줄어들지는 않음 3->8 o 8->3 x
		
		sb2.trimToSize(); // 자주쓰면 좋지 않음. 확보된 공간을 쓰며 성능을 빠르게 하려고 buffer를 사용하는데 안쓰는 공간을 날리고 날리는 만큼 복사해야해서 속도가 느림 ㅁ
		System.out.println(sb2 + ":" + sb2.capacity()); //안쓰는 용량 줄임
		
	
	} // main end
} // Ex02 end
