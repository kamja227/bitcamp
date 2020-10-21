package com.bit.day13;

public class Score02 {
	//학생성적관리프로그램(ver 0.1.0)
	//문자열이용
	
	//1.보기 2.입력 3.수정 4.삭제 0.종료>>2
	//국어>
	//영어>
	//수학>
	
	//1.보기 2.입력 3.수정 4.삭제 0.종료>>1
	
	//학번 국어 영어 수학 합계 평균
	//----------------------------------
	//1	   90   90    90   70    09
	
	//1.보기 2.입력 3.수정 4.삭제 0.종료>>3
	//학번>
	//국어>
	//영어>
	//수학>

	public static void main(String[] args) {
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		
		String title = "학생성적관리프로그램(ver 0.1.0)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>> ";
		//학번 국어 영어 수학
		System.out.print("총인원: ");
		int su = sc.nextInt(); // 총인원
		
		int[][] data = null; 
		data = new int[su][]; 
		
		System.out.println(title);
		System.out.println("-------------------------------------------");
		int input = 0; // menu입력값
		int idx = 0;  // 
		int cnt = 0; // 학번
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt(); // menu 입력값
			
			if(input == 0) {break;} // 종료
			
			if(input == 2 && su>cnt) { // 입력 
				
				int[] stu = new int[4]; // 학번 국어 영어 수학 담는 배열 stu
				data[idx++] = stu; // idx만큼 배열 늘리고 stu복사
			
				cnt++; // 학번
				stu[0] = cnt;
				System.out.print("국어>>");
				stu[1] = sc.nextInt();
				System.out.print("영어>>");
				stu[2] = sc.nextInt();
				System.out.print("수학>>");
				stu[3] = sc.nextInt();
			}
			if(input == 1) { // 보기
				System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균\n");
				System.out.println("-------------------------------------------");
				for(int i=0; i<cnt; i++) { //for(int i=0; i<data.length; i++) {
					int[] stu = data[i]; // stu에 data복사
					if(stu == null) { continue; }
					System.out.print(stu[0]+"\t|");
					System.out.print(stu[1]+"\t|");
					System.out.print(stu[2]+"\t|");
					System.out.print(stu[3]+"\t|");
					System.out.print(stu[1]+stu[2]+stu[3]+"\t|");
					System.out.println((stu[1]+stu[1]+stu[1])*100/3/100.0);
				}
			}
			if(input == 4) { // 삭제
				int tmp = -1;
				System.out.print("학번>>");
				int num = sc.nextInt();
				for(int i=0; i<data.length; i++) {
					int[] stu = data[i];
					if(stu == null) { continue; }
					if(stu[0] == num) { tmp = i; }
				}
				if(tmp != -1) {data[tmp] = null;} 
			
			}
			if(input == 3) { // 수정
				int tmp = -1;
				int[] stu = new int[4];
				
				System.out.print("학번>>");
				int num = sc.nextInt();
				for(int i=0; i<data.length; i++) {
					int[] stu2 = data[i];
					if(stu2 == null) { continue; }
					if(stu2[0] == num) { tmp = i; }
				}
				if(tmp != -1) {data[tmp] = stu;}
				stu[0] = cnt;
				System.out.print("국어>>");
				stu[1] = sc.nextInt();
				System.out.print("영어>>");
				stu[2] = sc.nextInt();
				System.out.print("수학>>");
				stu[3] = sc.nextInt();
			}
		}
		System.out.println("이용해주셔서 감사합니다");
		
	}
}
