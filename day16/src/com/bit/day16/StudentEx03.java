package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx03 {

   public static void main(String[] args) {
      ArrayList<StudentVO> list = new ArrayList<StudentVO>();
      Scanner scanner = new Scanner(System.in);
      StudentController controller = new StudentController(list);
      StudentViewer viewer = new StudentViewer();

      while (true) {
         System.out.println("비트고등학교 성적 입출력 프로그램");
         System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 >> ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         if (choice == 1) {
            // 입력할때만 객체를 만들어서 쓰자
            // 그 객체를 리스트에 추가하면 언제든 불러올 수 있음
        	 
            StudentVO s = viewer.setInformation(scanner);
            controller.add(s);
           
         } else if (choice == 2) {
            for (StudentVO s : list) { // 향상된 for문
               System.out.println(s);
            }
         } else if (choice == 5) {
            System.out.println("사용해주셔서 감사합니다");
            break;
         } else if (choice == 3) {
            // 수정
            if (list.size() == 0) {
               System.out.println("아직 아무것도 없습니다");
            } else {
               for (StudentVO s : list) {
                  System.out.println(s);
               }
               System.out.println("수정할 학번을 선택해주세요: ");
               StudentVO s = new StudentVO();
               s.setId(scanner.nextInt());
               while (controller.findById(s) == null) {
                  System.out.println("잘못된 학번입니다");
                  System.out.println("수정할 학번을 선택해주세요");
                  s.setId(scanner.nextInt());
               }
               scanner.nextLine();
               
               // 수정의 경우 두가지 방법으로 접근 가능
               // 1. 해당 index에 끼워넣고 원래 있던것을 삭제
               // 2. ArrayList.set()을 사용하는 방법
               // 두개 모두 index 필요
               s = viewer.setInformation(scanner);
               controller.set(s);
            }

         } else if (choice == 4) {
            // 삭제
            if (list.size() == 0) {
               System.out.println("아직 아무것도 없습니다");
            } else {
               for (StudentVO s : list) {
                  System.out.println(s);
               }
               System.out.println("삭제할 학번을 선택해주세요: ");
               StudentVO s = new StudentVO();
               s.setId(scanner.nextInt());
               while (controller.findById(s) == null) {
                  System.out.println("잘못된 학번입니다");
                  System.out.println("삭제할 학번을 선택해주세요");
                  s.setId(scanner.nextInt());
               }
               scanner.nextLine();
               controller.remove(s);
            }
         }
      }// while

      scanner.close();

   }// main

}// class
