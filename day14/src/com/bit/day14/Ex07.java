package com.bit.day14;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Calendar cal = java.util.Calendar.getInstance(); // new로
																	// 객체생성불가.
																	// getinstance로
																	// 객체받아옴
		// System.out.println(cal);

		System.out.print(cal.get(Calendar.YEAR) + "년");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월"); // 전산에서
																// calendar.MONTH
																// : 0월~11월 ,
																// +1해줘야한다.
		System.out.print(cal.get(Calendar.DATE) + "일");
		System.out.println();
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "시"); // 24시 기준
		// System.out.print(cal.get(Calendar.HOUR)+"시"); 0시~11
		System.out.print(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		if (cal.get(Calendar.AM) == 0) {
			System.out.print("am");
		} else if (cal.get(Calendar.AM) == 1) {
			System.out.print("pm");
		}
		System.out.print(cal.get(Calendar.HOUR) + "시"); // 0~11시
		System.out.print(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");

		// System.out.println(cal.get(Calendar.DAY_OF_WEEK));요일은 숫자로 표현. 1~7 일~토
		char ch = '?';
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				ch = '일';
				System.out.println();
				break;
			case 2:
				ch = '월';
				System.out.println();
				break;
			case 3:
				ch = '화';
				System.out.println();
				break;
	
			case 4:
				ch = '수';
				System.out.println();
				break;
			case 5:
				ch = '목';
				System.out.println();
				break;
			case 6:
				ch = '금';
				System.out.println();
				break;
			case 7:
				ch = '토';
				System.out.println();
				break;
	
			default:
				break;
		}
		System.out.print("[" + ch + "]");
		System.out.println("요일");

		System.out.println("2020년의 " + cal.get(Calendar.WEEK_OF_YEAR) + "번째 주");
		System.out.println("2020년의 " + cal.get(Calendar.DAY_OF_YEAR) + "번째 날");
		System.out.println("2020년 5월의 " + cal.get(Calendar.DAY_OF_MONTH)
				+ "번째 날");
		System.out.println("2020년 5월의 " + cal.get(Calendar.WEEK_OF_MONTH)
				+ "번째 주");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
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
