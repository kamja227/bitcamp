package com.bit.day16;

import java.util.Scanner;

public class StudentVer2 {

	
	String name;
	int kor, eng, mat;
	
	
	public static void main(String[] args){

		StudentVer2 s = new StudentVer2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л��� �̸��� �Է��ϼ���: ");
		s.name = sc.nextLine();
		System.out.println("�������� �Է�: ");
		s.kor = sc.nextInt();
		System.out.println("�������� �Է�: ");
		s.eng = sc.nextInt();
		System.out.println("�������� �Է�: ");
		s.mat = sc.nextInt();
		s.operateSum();
		s.operateavg();
		System.out.printf("�л��� �̸�: %s\t���� ����: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f" ,s.name, s.kor, s.eng, s.mat, s.operateSum(), s.operateavg());
		sc.close();
		
		
	}//mianEnd
	
	
	public int operateSum(){
		return kor + eng + mat;
	}
	
	public double operateavg(){
		return (kor + eng + mat)/3.0;
	}
}//classEnd
