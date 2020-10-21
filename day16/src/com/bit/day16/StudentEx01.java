package com.bit.day16;

public class StudentEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO[] arr = new StudentVO[0];
		StudentVO s = new StudentVO();
		s.setName("형진");
		s.setKor(88);
		s.setEng(99);
		s.setMath(77);
		System.out.println(arr.length);//초기값대로 배열크기 0이다 
		arr = StudentArrayUtil.add(arr, s); //배열크기를 늘린다. 

		System.out.println(arr.length);
		System.out.println("position of 's' " + StudentArrayUtil.indexOf(arr, s));
	
		StudentVO s2 = new StudentVO();
		s2.setName("형진2");
		s2.setKor(88);
		s2.setEng(99);
		s2.setMath(77);
		
		System.out.println(arr.length);//초기값대로 배열크기 0이다 
		System.out.println("position of 's2' " + StudentArrayUtil.indexOf(arr, s2));  
		arr = StudentArrayUtil.add(arr, s2); //배열크기를 늘린다. 
		
		System.out.println(arr.length);//배열크기는 4
		System.out.println("position of 's2' " + StudentArrayUtil.indexOf(arr, s2));  
		
		StudentVO s3 = new StudentVO();
		s3.setName("형진3");
		s3.setKor(88);
		s3.setEng(99);
		s3.setMath(77);
		StudentVO s4 = new StudentVO();
		s4.setName("형진4");
		s3.setKor(88);
		s4.setEng(99);
		s4.setMath(77);
		StudentVO s5 = new StudentVO();
		s5.setName("형진5");
		s5.setKor(88);
		s5.setEng(99);
		s5.setMath(77);
		//arr = StudentArrayUtil.add(arr, s2);
		arr = StudentArrayUtil.add(arr, s3);
		arr = StudentArrayUtil.add(arr, s4);
		arr = StudentArrayUtil.add(arr, s5);
		System.out.println("arr의 현재 크기 : " + arr.length);
		arr = StudentArrayUtil.remove(arr, s4);
		System.out.println("arr의 현재 크기 : " + arr.length);
		
		
		StudentVO s6 = new StudentVO();
		s6.setName("형진6");
		s6.setKor(88);
		s6.setEng(99);
		s6.setMath(77);
		
		System.out.println("s6의 인덱스 : " + StudentArrayUtil.indexOf(arr, s6));
		System.out.println("arr의 현재 크기 : " + arr.length);
		arr = StudentArrayUtil.remove(arr, s6);
		System.out.println("arr의 현재 크기 : " + arr.length);
	}
	

}
