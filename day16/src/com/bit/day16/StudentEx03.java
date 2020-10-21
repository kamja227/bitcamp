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
         System.out.println("��Ʈ����б� ���� ����� ���α׷�");
         System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� >> ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         if (choice == 1) {
            // �Է��Ҷ��� ��ü�� ���� ����
            // �� ��ü�� ����Ʈ�� �߰��ϸ� ������ �ҷ��� �� ����
        	 
            StudentVO s = viewer.setInformation(scanner);
            controller.add(s);
           
         } else if (choice == 2) {
            for (StudentVO s : list) { // ���� for��
               System.out.println(s);
            }
         } else if (choice == 5) {
            System.out.println("������ּż� �����մϴ�");
            break;
         } else if (choice == 3) {
            // ����
            if (list.size() == 0) {
               System.out.println("���� �ƹ��͵� �����ϴ�");
            } else {
               for (StudentVO s : list) {
                  System.out.println(s);
               }
               System.out.println("������ �й��� �������ּ���: ");
               StudentVO s = new StudentVO();
               s.setId(scanner.nextInt());
               while (controller.findById(s) == null) {
                  System.out.println("�߸��� �й��Դϴ�");
                  System.out.println("������ �й��� �������ּ���");
                  s.setId(scanner.nextInt());
               }
               scanner.nextLine();
               
               // ������ ��� �ΰ��� ������� ���� ����
               // 1. �ش� index�� �����ְ� ���� �ִ����� ����
               // 2. ArrayList.set()�� ����ϴ� ���
               // �ΰ� ��� index �ʿ�
               s = viewer.setInformation(scanner);
               controller.set(s);
            }

         } else if (choice == 4) {
            // ����
            if (list.size() == 0) {
               System.out.println("���� �ƹ��͵� �����ϴ�");
            } else {
               for (StudentVO s : list) {
                  System.out.println(s);
               }
               System.out.println("������ �й��� �������ּ���: ");
               StudentVO s = new StudentVO();
               s.setId(scanner.nextInt());
               while (controller.findById(s) == null) {
                  System.out.println("�߸��� �й��Դϴ�");
                  System.out.println("������ �й��� �������ּ���");
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
