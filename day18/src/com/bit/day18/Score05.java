package com.bit.day18;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int num, kor, eng, math;
}

public class Score05 {
	
	public static void main(String[] args) {
		// �л� �������� ���α׷� (ver 0.2.0)
		// �й� ���� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� �������� ���α׷� (ver 0.2.0)");
		System.out.println("------------------------------------------");
		Student[] data = new Student[0];
		String input = null;
		
		while(true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >> ");
			input = sc.nextLine();
			if(input.equals("0")) {
				break;
				
			}else if(input.equals("2")) {
				// �Է�
				Student stu = new Student();
				System.out.print("�й� >> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("���� >> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("���� >> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.print("���� >> ");
				stu.math = Integer.parseInt(sc.nextLine());
				data = new Student[data.length+1];
//				Student[] temp = new Student[data.length+1]; // ����3�Ҷ� �ʿ����
				// ����
//				for(int i=0; i<data.length; i++) {
//					temp[i] = data[i];
//				} // ����
				data = Arrays.copyOf(data,data.length+1); // ����3
//				System.arraycopy(data, 0, temp, 0, data.length); // ����
//				data = temp;
				// �迭�� �ø��°� �Ұ����ؼ� ���� �迭�� ����������
				// �ű�
				data[data.length-1] = stu;
				
			} else if(input.equals("1")) {
				// ����
				System.out.println("-----------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------------");
				for(int i=0; i<data.length; i++) {
					Student stu = data[i];
					System.out.print(stu.num);
					System.out.println("\t");
					System.out.print(stu.kor);
					System.out.println("\t");
					System.out.print(stu.eng);
					System.out.println("\t");
					System.out.print(stu.math);
					System.out.println("-----------------------------------");
				}
				
			} else if(input.equals("3")) {
				// ����
				Student stu = new Student();
				System.out.print("�й� >> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("���� >> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("���� >> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("���� >> ");
				stu.math = Integer.parseInt(sc.nextLine());
				
				int i = 0;
				for(i=0; i<data.length; i++) {
					Student target = data[i];
					if(target.num == stu.num) {break;}
				}
				if(i<data.length) {
					data[i] = stu;
				} else {
					System.out.println("������ �й��� �����ϴ�");
				}
				
			} else if(input.equals("4")) {
				// ����
				System.out.println("�й� >> ");
				int num = Integer.parseInt(sc.nextLine());
				int idx = -1;
				for(int i=0; i<data.length; i++) {
					if(data[i].num == num) {
						idx = i;
					}
				}
				if(idx > -1) {
					Student[] temp = new Student[data.length-1];
					//i�������� �պκ� ����
//					for(int i=0; i<idx; i++) {
//						temp[i] = data[i];
//					}
					System.arraycopy(data, 0, temp, 0, idx); //�迭 ����
					//�޺κ� ����
					for(int i=idx+1; i<temp.length; i++) {
						temp[i] = data[i+1];
					}
					System.arraycopy(data, idx+1, temp, idx, temp.length-idx);
					data = temp;
				}
			}
		} // while end
		System.out.println("�̿����ּż� �����մϴ�");
	} // main end
} // Score05 end