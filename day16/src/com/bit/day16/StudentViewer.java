package com.bit.day16;

import java.util.Scanner;

/* ��´���� ��������
 * viewer �� ���������� html code�� �����ų� ���Ŭ������ �������� �ִ�. 
 *���� �ȹ�����Ƿ� main�޼��� �̿�.
 * */

public class StudentViewer {

	public StudentVO setInformation( Scanner scanner) {

//		StudentVO s = new StudentVO();
//		StudentController c = new StudentController(null);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�л��� �̸�: ");
//		s.setName(sc.nextLine());
//		System.out.print("�л��� ��������: ");
//		s.setKor(sc.nextInt());
//		System.out.print("�л��� ��������: ");
//		s.setEng(sc.nextInt());
//		System.out.print("�л��� ��������: ");
//		s.setMath(sc.nextInt());
//		System.out
//				.printf("�л��� �̸�: %s\t���� ����: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f",
//						s.getName(), s.getKor(), s.getEng(), s.getMath(), c.operateSum(s),
//						c.operateAvg(s));		//field�� �ִ� VO�� ���� Controller�� �������ϰ� returnvalue�� ����, ��� 
//		
//		
//		
//		sc.close();
		
		StudentVO s = new StudentVO();
		
		System.out.print("�̸�: ");
		s.setName(scanner.nextLine());
        System.out.print("����: ");
        s.setKor(scanner.nextInt());
        System.out.print("����: ");
        s.setEng(scanner.nextInt());
        System.out.print("����: ");
        s.setMath(scanner.nextInt());
		
		return s;
	}

	
	//���α׷��� ����� ���� : ��model(VO) ��view(main) ��Ʈ�ѷ�(controller) - MVC����
}
