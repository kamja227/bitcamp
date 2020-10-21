package com.bit.day16;

import java.util.Scanner;

/*
 * 
 * ���������� ���.
 * 2 ���� ��� C/C++
 * ����ü�� ���� �� �ȿ� ������ ������ ����
 * �Լ�(function)�� ���� ���α׷��� ����� ����
 * >> ��ɰ� ������ ���� ������. 
 * >> �����Ϳ� ����� ���� ���� �ҷ��ͼ� �����
 *
 * ��ü������ ���
 * 3���� JAVA
 * �������� ���¿� ����� �ϳ���  Class�� ���ļ� �ʿ��� �� class�� ����Ѵ�. 
 * Student class >> field + method (�л� ���� + ��� )
 * �ʿ��� �� Student()��ü�� ���� Student class�� �̿��Ѵ�. 
 * 
 * student() A <-> student() B ����� ���̴� ����. 
 * field�� ���� ������ ��ü�� �ٸ��� �����Ѵ�.
 * 
 * POJO - Plain Old Java Object -"����� ���� �ڹ� ��ü"
 * 
 * ��ü���� ����и� ���� >> ����и� ������ ���ο� Class
 * ��ü������ 5��Ģ >> SOLID
 * Single Responsibility Principle	����å��
 * Open-Closed Principle			�������
 * Liskov Substitution Principle	��������
 * interface Segregation Principle	�������̽� �и�
 * Dependency Inversion  Principle	����������
 * 
 *	Single Responsibility >> �ϳ��� Ŭ������ �ϳ��� ������ ��� �ϵ��� �Ѵ�. 
 *	UI����̸� UI�� ���õ� �ʵ�� �޼ҵ常 ������. 
 *	������ Ŭ���� �и��� ���� ���뼺�� ���δ�. 
 * 
 *  Ŭ������ ŸŬ������ ����̳� ������ �ʿ��� �� >> ��Ʈ�ѷ�Ŭ������ ������ Ŭ������ �������ΰ��谡 �ȴ�.
 *  ������ Ŭ������ ������ ����� ��Ʈ�ѷ��� ������ �Ǿ���Ѵ�.
 *  Dependency Injection ����������. �ܺ�Ŭ������ ������. 
 *  ��Ʈ�ѷ� Ŭ������ ���� Ŭ������ ����� �����ʰ� �ܺ�Ŭ�������� ������ɹ޾ƾ�
 *  Spring���� �ذ�.
 *  
 *  
 * 
 * 
 * 
 */


public class StudentVer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.println("�������� �Է�: ");
		int kor = sc.nextInt();
		System.out.println("�������� �Է�: ");
		int eng = sc.nextInt();
		System.out.println("�������� �Է�: ");
		int mat = sc.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.printf("�л��� �̸�: %s\t���� ����: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f" ,name, kor, eng, mat, sum, avg);
		sc.close();
		
		
		
		
		
	}//mainEnd

}//classEnd
