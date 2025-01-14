package com.bit.test;

import java.util.ArrayList;
import java.util.Scanner;

// 학생성적관리프로그램(ver 1.0.0)
// Student 클래스를 작성하여 학번, 이름, 국어, 영어, 수학을 담으시오
// 자료구조를 활용하여 동적으로 작동되도록 하시오
// 콘솔 입출력하도록 작성하시오
// ex) 1.전체 2.상세 3.입력 4.수정 5.삭제 0.종료>2
//	학번>1
//	학번:1 이름:홍길동
//	국어:90		영어:80		수학:70
//	총점:000
//	평균:00.00

class Student {
	int num, kor, eng, math;
	String name;
	
	Student() { }
	
	int tot() { return kor + eng + math; }
	
	double avg() { return tot() * 100 / 3 /100.0; }
	
	void stuInfo() {
		System.out.println("학번:" + this.num + " 이름:" + this.name);
		System.out.println("국어:" + this.kor + "\t영어:" + this.eng + "\t수학:" + this.math);
		System.out.println("총점:" + this.tot());
		System.out.println("평균:" + this.avg() + "\n");
	}
	
	void stuWrite() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름>");
		this.name = sc.nextLine();
		System.out.print("국어>");
		this.kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어>");
		this.eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학>");
		this.math = Integer.parseInt(sc.nextLine());
	}
}

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생성적관리프로그램 (ver 1.0.0)\n");
		String menu = "1.전체 2.상세 3.입력 4.수정 5.삭제 0.종료>";
		ArrayList<Student> list = new ArrayList<Student>(); // 학생 성적을 담을 배열 list

		while(true) {
			System.out.print(menu);
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if(menuNum == 0) {
				// 종료
				System.out.println("프로그램을 종료합니다. ");
				break;
				
			} else if(menuNum == 1) { 
				// 전체
				if(list.size() == 0) { // 입력된 학생 성적이 없을 때
					System.out.println("입력된 학생 성적이 없습니다. 성적을 먼저 입력해 주세요. \n");
					continue;
				}
				System.out.println(list.size() + "명의 학생 성적 정보를 출력합니다. \n");
				
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					stu.stuInfo();
				}
				
			} else if(menuNum == 2) {
				// 상세
				if(list.size() == 0) { // 입력된 학생 성적이 없을 때
					System.out.println("입력된 학생 성적이 없습니다. 성적을 먼저 입력해 주세요. \n");
					continue;
				}
				System.out.print("학번>");
				int showNum = Integer.parseInt(sc.nextLine());

				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					if(showNum == stu.num) {
						stu.stuInfo();
					}
				} // for end
				
			} else if(menuNum == 3) {
				// 입력
				try {
					Student stu = new Student();
					System.out.print("학번>");
					stu.num = Integer.parseInt(sc.nextLine());
					stu.stuWrite();
					System.out.println(stu.name + " 학생의 성적이 입력되었습니다. ");
					System.out.println();
					
					list.add(stu); // 입력한 학생 성적을 배열 list에 담는다
					
				} catch(Exception e) {
					System.out.println("다시 입력하세요. ");
				} // try-catch end
				
			} else if(menuNum == 4) {
				// 수정
				System.out.print("수정할 학생의 학번>");
				int reNum = Integer.parseInt(sc.nextLine());

				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i); // list에 저장된 첫번째 학생의 성적부터 가져오면서
					if(reNum == stu.num) { // 수정할 학생의 학번과 같은 값을 찾는다
						stu.stuWrite();
						System.out.println(stu.name + " 학생의 정보가 수정되었습니다. ");
						System.out.println();
						break;
					}
				} // for end

			} else if(menuNum == 5) {
				// 삭제
				System.out.print("삭제할 학생의 학번>");
				int delNum = Integer.parseInt(sc.nextLine());
				
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i); // list에 저장된 첫번째 학생의 성적부터 가져오면서
					if(delNum == stu.num) { // 삭제할 학생의 학번과 같은 값을 찾는다
						list.remove(i);
						System.out.println(stu.name + " 학생의 성적 정보가 삭제되었습니다." + "\n");
						break;
					}
				}
			} // else if end
		} // while end
		
	} // main end
} // Test01 end
