package com.bit.day08;
//모닝 150제한
// -시속x

class Car {
	String model=" ";
	int limit=150;
	int speed=0;
	int accel=40;
	String menu=" ";

	public void speedUp() {
		speed+=accel;	
		if(speed>150) {speed=limit;}
	}
	public void speedDown() {
		speed-=accel+5;
		if(speed<0) {speed=0;}
	}		
} //car end


class Car01 {
	public static void main(String[] args) {
		Car myCar=new Car(); //myCar 참조변수
		myCar.model="모닝";
		String menu="1.차량선택 2.가속 3.감속 0.종료>>";
		java.util.Scanner sc=null;

		sc=new java.util.Scanner(System.in);
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();

			if(input==0){break;}
			else if(input==1) {
				System.out.print("차량을 선택하세요");
				System.out.print("1.모닝 2.k3 3.셀토스>>");
				input=sc.nextInt();
				if(input==1){
					myCar=new Car();
					myCar.model="모닝";
					myCar.accel=10;
					myCar.limit=150;
				}else if(input==2) { 
					myCar=new Car();
					myCar.model="k3";
					myCar.accel=14;
					myCar.limit=180;
				}else if(input==3) { 
					myCar=new Car(); 
					myCar.model="셀토르";
					myCar.accel=18;
					myCar.limit=220;
				}
			}
			else if(input==2){myCar.speedUp();}
			else if(input==3){myCar.speedDown();}
			
			System.out.println(myCar.model+" 현재속도는 "+myCar.speed+"Km입니다");
			System.out.println();
			
			


		}

		/*
		System.out.println(myCar.model+"현재속도: "+myCar.speed+"km");
		myCar.speedUp();
		System.out.println(myCar.model+"현재속도:"+myCar.speed+"km");
		myCar.speedUp();
		System.out.println(myCar.model+"현재속도:"+myCar.speed+"km");
		myCar.speedDown();
		System.out.println(myCar.model+"현재속도:"+myCar.speed+"km");
		myCar.speedDown();
		System.out.println(myCar.model+"현재속도:"+myCar.speed+"km");

		myCar=new Car(); //차바꿈
		myCar.model="k3";
		myCar.accel=15;
		
		System.out.println(myCar.model+"현재속도: "+myCar.speed+"km");
		myCar.speedUp();
		System.out.println(myCar.model+"현재속도: "+myCar.speed+"km");
		myCar.speedUp();
		System.out.println(myCar.model+"현재속도: "+myCar.speed+"km");
		myCar.speedUp();	
		*/
	
	}
}	