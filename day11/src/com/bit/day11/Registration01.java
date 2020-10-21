package com.bit.day11;

public class Registration01 {
	// 주민번호입력:090206-3124567
	// >> 당신은 00세 남자입니다
	// 주민번호입력:990206-2124567
	// >> 당신은 00세 여자입니다

	// 주민번호입력:99022020020
	// >> 입력패턴을 다시확인하세요(000000-0000000)
	// 주민번호입력:99022020020
	// >> 입력패턴을 다시확인하세요(000000-0000000)
	// 주민번호입력:99022020020
	// >> 입력패턴을 다시확인하세요(000000-0000000)

	public static void main(String[] args) {
		String msg = null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("주민번호입력 : ");
			msg = sc.nextLine();
			
			if (msg.length() != 14) {
				System.out.println("자릿수를 다시 확인하세요");
				continue;
			} else if (msg.charAt(6) != '-') {
				System.out.println("입력패턴을 다시확인하세요(0000000-0000000)");
				continue;
			} 
			
			boolean suCheck = false;
			
			for (int i=0; i<msg.length(); i++) {
				if (i == 6) { continue; }
//				if (msg.charAt(i) >= '0' && msg.charAt(i) < '9') {
//					
//				} else {
//					suCheck = true;
//				}
				if (!(msg.charAt(i) >= '0' && msg.charAt(i) <= '9')) {
				}
			}
			if (suCheck) { continue; }

			char year1 = msg.charAt(0); // 9
			char year2 = msg.charAt(1); // 9
			int year = (year1 - '0') * 10 + (year2 - '0') * 1;
			char gender = msg.charAt(7);

			if (gender == '3' || gender == '4') {
				System.out.print("당신은 " + (2020 - (2000 - year) + 1) + "세 ");
			} else if (gender == '1' || gender == '2') {
				System.out.print("당신은 " + (2020 - (1900 - year) + 1) + "세 ");
			}

			if ((gender == '1') || (gender == '3')) {
				System.out.println("남자입니다");
			} else if ((gender == '2') || (gender == '4')) {
				System.out.println("여자입니다");
			}
			break;
			
		}
	}
}