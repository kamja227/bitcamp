package com.bit.day14;

public class Score03 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.1.1)
		// 학번 이름 국어 영어 수학
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String[] data = null;
		System.out.print("총원 >> ");
		int limit = Integer.parseInt(sc.nextLine()); 
		data = new String[limit]; //총원제어
		int err = 0;
		int cnt = 0;
		
		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >> ");
			String input = sc.nextLine();
			
			if (input.equals("0")) {
				break;
			}
			
			if (input.equals("1")) {err = 0; // 에러 누적 방지
				//보기
				System.out.println("---------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|평균");
				System.out.println("---------------------------------------------");
				for(int i=0; i<data.length; i++) {
					if(data[i] == null) {continue;}
					String msg = data[i];
					String[] stu = msg.split(","); // ,단위로 끊음
					int num = Integer.parseInt(stu[0]);
					String name = stu[1];
					int kor = Integer.parseInt(stu[2]);
					int eng = Integer.parseInt(stu[3]);
					int math = Integer.parseInt(stu[4]);
					double avg = (kor+ eng + math) * 100 / 3 / 100.0;
					System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + avg);
				}
				System.out.println("---------------------------------------------");
				
			} else if (input.equals("2")) {err = 0;
				// 입력
				
				if(cnt < limit) {  
					cnt++;
					System.out.print("이름 >> ");
					String name = sc.nextLine();
					System.out.print("국어 >> ");
	//				int kor = sc.nextInt();
					int kor = Integer.parseInt(sc.nextLine());
					System.out.print("영어 >> ");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.print("수학 >> ");
					int math = Integer.parseInt(sc.nextLine());
	//				double avg = (kor + eng + math)*100 / 3 / 100.0;
					
					data[cnt-1] = cnt +","+ name +","+ kor +","+ eng +","+ math; //총원 ?
				} else {
					System.out.println("입력할 학생이 없습니다");
				}
				
			} else if (input.equals("3")) {err = 0;
				// 수정 // 입력 if안에와 같음 cnt -> num
				System.out.print("학번 >> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("이름 >> ");
				String name = sc.nextLine();
				System.out.print("국어 >> ");
	//				int kor = sc.nextInt();
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 >> ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 >> ");
				int math = Integer.parseInt(sc.nextLine());
	//				double avg = (kor + eng + math)*100 / 3 / 100.0;
				
				data[num-1] = num +","+ name +","+ kor +","+ eng +","+ math; //총원 ?
				
			} else if (input.equals("4")) {
				// 삭제
				System.out.print("학번 >> ");
				int num = Integer.parseInt(sc.nextLine());
				data[num-1] = null;
				
			} else {
				//오류
				err++;
				System.out.println("메뉴를 확인하시고 입력해주세요\n\n");
				if (err > 3) {
					System.out.println("프로그램이 종료됩니다");
					break;
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");

	} // main end
} // class end
