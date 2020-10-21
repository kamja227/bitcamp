package com.bit.day18;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int num, kor, eng, math;
}

public class Score05 {
	
	public static void main(String[] args) {
		// 학생 성적관리 프로그램 (ver 0.2.0)
		// 학번 국어 영어 수학
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 성적관리 프로그램 (ver 0.2.0)");
		System.out.println("------------------------------------------");
		Student[] data = new Student[0];
		String input = null;
		
		while(true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >> ");
			input = sc.nextLine();
			if(input.equals("0")) {
				break;
				
			}else if(input.equals("2")) {
				// 입력
				Student stu = new Student();
				System.out.print("학번 >> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("국어 >> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 >> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 >> ");
				stu.math = Integer.parseInt(sc.nextLine());
				data = new Student[data.length+1];
//				Student[] temp = new Student[data.length+1]; // 복사3할때 필요없음
				// 기존
//				for(int i=0; i<data.length; i++) {
//					temp[i] = data[i];
//				} // 복사
				data = Arrays.copyOf(data,data.length+1); // 복사3
//				System.arraycopy(data, 0, temp, 0, data.length); // 복사
//				data = temp;
				// 배열을 늘리는게 불가능해서 기존 배열을 깊은복사함
				// 신규
				data[data.length-1] = stu;
				
			} else if(input.equals("1")) {
				// 보기
				System.out.println("-----------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
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
				// 수정
				Student stu = new Student();
				System.out.print("학번 >> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("국어 >> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어 >> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학 >> ");
				stu.math = Integer.parseInt(sc.nextLine());
				
				int i = 0;
				for(i=0; i<data.length; i++) {
					Student target = data[i];
					if(target.num == stu.num) {break;}
				}
				if(i<data.length) {
					data[i] = stu;
				} else {
					System.out.println("수정할 학번이 없습니다");
				}
				
			} else if(input.equals("4")) {
				// 삭제
				System.out.println("학번 >> ");
				int num = Integer.parseInt(sc.nextLine());
				int idx = -1;
				for(int i=0; i<data.length; i++) {
					if(data[i].num == num) {
						idx = i;
					}
				}
				if(idx > -1) {
					Student[] temp = new Student[data.length-1];
					//i기준으로 앞부분 복사
//					for(int i=0; i<idx; i++) {
//						temp[i] = data[i];
//					}
					System.arraycopy(data, 0, temp, 0, idx); //배열 복사
					//뒷부분 복사
					for(int i=idx+1; i<temp.length; i++) {
						temp[i] = data[i+1];
					}
					System.arraycopy(data, idx+1, temp, idx, temp.length-idx);
					data = temp;
				}
			}
		} // while end
		System.out.println("이용해주셔서 감사합니다");
	} // main end
} // Score05 end