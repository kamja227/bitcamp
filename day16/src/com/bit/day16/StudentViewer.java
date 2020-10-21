package com.bit.day16;

import java.util.Scanner;

/* 출력담당은 웹페이지
 * viewer 는 웹페이지에 html code를 보내거나 뷰어클래스가 없을때도 있다. 
 *웹을 안배웠으므로 main메서드 이용.
 * */

public class StudentViewer {

	public StudentVO setInformation( Scanner scanner) {

//		StudentVO s = new StudentVO();
//		StudentController c = new StudentController(null);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학생의 이름: ");
//		s.setName(sc.nextLine());
//		System.out.print("학생의 국어점수: ");
//		s.setKor(sc.nextInt());
//		System.out.print("학생의 영어점수: ");
//		s.setEng(sc.nextInt());
//		System.out.print("학색의 수학점수: ");
//		s.setMath(sc.nextInt());
//		System.out
//				.printf("학생의 이름: %s\t국어 점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f",
//						s.getName(), s.getKor(), s.getEng(), s.getMath(), c.operateSum(s),
//						c.operateAvg(s));		//field만 있는 VO를 통해 Controller로 연산을하고 returnvalue로 총합, 평균 
//		
//		
//		
//		sc.close();
		
		StudentVO s = new StudentVO();
		
		System.out.print("이름: ");
		s.setName(scanner.nextLine());
        System.out.print("국어: ");
        s.setKor(scanner.nextInt());
        System.out.print("영어: ");
        s.setEng(scanner.nextInt());
        System.out.print("수학: ");
        s.setMath(scanner.nextInt());
		
		return s;
	}

	
	//프로그램을 만드는 패턴 : 모델model(VO) 뷰view(main) 컨트롤러(controller) - MVC패턴
}
