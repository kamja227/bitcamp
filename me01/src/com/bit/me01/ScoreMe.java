package com.bit.me01;

import java.util.ArrayList;

class Student {
	int num;
	String name;
	int kor, eng, math;
	
	public Student(){ }
	
	public int sum() {return kor + eng + math; }
	
	public double avg() { 
		return sum()/3;
	}
}

public class ScoreMe {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		System.out.println("성적관리프로그램(ver 0.2.0)");
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >> ");
			String input = sc.nextLine();

			if(input.equals("0")) {
				break;
				
			} else if(input.equals("1")) {
				// 보기
				System.out.println("--------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------");
				
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor+ "\t" + stu.eng+ "\t" + stu.math+ "\t" + stu.sum() + "\t" + stu.avg()+ "\n");
				}
				
				
			} else if(input.equals("2")) {
				// 입력
				try {
					Student stu =  new Student();
					System.out.print("학번>");
					stu.num = Integer.parseInt(sc.nextLine());
					System.out.print("이름>");
					stu.name = sc.nextLine();
					System.out.print("국어>");
					stu.kor = Integer.parseInt(sc.nextLine());
					System.out.print("영어>");
					stu.eng = Integer.parseInt(sc.nextLine());
					System.out.print("수학>");
					stu.math = Integer.parseInt(sc.nextLine());
					list.add(stu);
				} catch(Exception e) {
					System.out.println("다시 입력하세요");
				}
				
			} else if(input.equals("3")) {
				// 수정
				System.out.print("수정할 학번>");
				int reNum = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					if(reNum == stu.num) {
						System.out.print("이름>");
						stu.name = sc.nextLine();
						System.out.print("국어>");
						stu.kor = Integer.parseInt(sc.nextLine());
						System.out.print("영어>");
						stu.eng = Integer.parseInt(sc.nextLine());
						System.out.print("수학>");
						stu.math = Integer.parseInt(sc.nextLine());
//						list.add(stu);
						break;
					} 
				}
			} else if(input.equals("4")) {
				// 삭제
				System.out.print("삭제할 학번>");
				int delNum = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					if(delNum == stu.num) { 
						list.remove(i);
						System.out.println(stu.name + "학생의 성적이 삭제되었습니다");
						break; }
				}
			}
				
		} // while end
	}
}
