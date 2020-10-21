package com.bit.day16;

import java.util.Scanner;

public class StudentVer2 {

	
	String name;
	int kor, eng, mat;
	
	
	public static void main(String[] args){

		StudentVer2 s = new StudentVer2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름을 입력하세요: ");
		s.name = sc.nextLine();
		System.out.println("국어점수 입력: ");
		s.kor = sc.nextInt();
		System.out.println("영어점수 입력: ");
		s.eng = sc.nextInt();
		System.out.println("수학점수 입력: ");
		s.mat = sc.nextInt();
		s.operateSum();
		s.operateavg();
		System.out.printf("학생의 이름: %s\t국어 점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f" ,s.name, s.kor, s.eng, s.mat, s.operateSum(), s.operateavg());
		sc.close();
		
		
	}//mianEnd
	
	
	public int operateSum(){
		return kor + eng + mat;
	}
	
	public double operateavg(){
		return (kor + eng + mat)/3.0;
	}
}//classEnd
