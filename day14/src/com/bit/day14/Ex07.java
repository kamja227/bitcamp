package com.bit.day14;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Calendar cal = java.util.Calendar.getInstance(); // new��
																	// ��ü�����Ұ�.
																	// getinstance��
																	// ��ü�޾ƿ�
		// System.out.println(cal);

		System.out.print(cal.get(Calendar.YEAR) + "��");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "��"); // ���꿡��
																// calendar.MONTH
																// : 0��~11�� ,
																// +1������Ѵ�.
		System.out.print(cal.get(Calendar.DATE) + "��");
		System.out.println();
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "��"); // 24�� ����
		// System.out.print(cal.get(Calendar.HOUR)+"��"); 0��~11
		System.out.print(cal.get(Calendar.MINUTE) + "��");
		System.out.println(cal.get(Calendar.SECOND) + "��");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		if (cal.get(Calendar.AM) == 0) {
			System.out.print("am");
		} else if (cal.get(Calendar.AM) == 1) {
			System.out.print("pm");
		}
		System.out.print(cal.get(Calendar.HOUR) + "��"); // 0~11��
		System.out.print(cal.get(Calendar.MINUTE) + "��");
		System.out.println(cal.get(Calendar.SECOND) + "��");

		// System.out.println(cal.get(Calendar.DAY_OF_WEEK));������ ���ڷ� ǥ��. 1~7 ��~��
		char ch = '?';
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				ch = '��';
				System.out.println();
				break;
			case 2:
				ch = '��';
				System.out.println();
				break;
			case 3:
				ch = 'ȭ';
				System.out.println();
				break;
	
			case 4:
				ch = '��';
				System.out.println();
				break;
			case 5:
				ch = '��';
				System.out.println();
				break;
			case 6:
				ch = '��';
				System.out.println();
				break;
			case 7:
				ch = '��';
				System.out.println();
				break;
	
			default:
				break;
		}
		System.out.print("[" + ch + "]");
		System.out.println("����");

		System.out.println("2020���� " + cal.get(Calendar.WEEK_OF_YEAR) + "��° ��");
		System.out.println("2020���� " + cal.get(Calendar.DAY_OF_YEAR) + "��° ��");
		System.out.println("2020�� 5���� " + cal.get(Calendar.DAY_OF_MONTH)
				+ "��° ��");
		System.out.println("2020�� 5���� " + cal.get(Calendar.WEEK_OF_MONTH)
				+ "��° ��");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println(cal.get(0)); // 1
		System.out.println(cal.get(1)); // year
		System.out.println(cal.get(2)); //
		System.out.println(cal.get(3)); //
		System.out.println(cal.get(4)); // month
		System.out.println(cal.get(5)); // day
		System.out.println(cal.get(6)); //
		System.out.println(cal.get(7)); //
		System.out.println(cal.get(8)); //
		System.out.println(cal.get(9)); // ?

	}// mainEnd

}// classEnd
