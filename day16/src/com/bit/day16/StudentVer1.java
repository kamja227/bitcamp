package com.bit.day16;

import java.util.Scanner;

/*
 * 
 * 절차지향적 언어.
 * 2 세대 언어 C/C++
 * 구조체를 만들어서 그 안에 변수들 데이터 저장
 * 함수(function)를 만들어서 프로그램의 기능을 지정
 * >> 기능과 변수를 따로 저장함. 
 * >> 데이터와 기능을 따로 따로 불러와서 사용함
 *
 * 객체지향적 언어
 * 3세대 JAVA
 * 데이터의 형태와 기능을 하나의  Class로 합쳐서 필요할 때 class를 사용한다. 
 * Student class >> field + method (학생 정보 + 기능 )
 * 필요할 때 Student()객체를 만들어서 Student class를 이용한다. 
 * 
 * student() A <-> student() B 기능적 차이는 없다. 
 * field의 값이 각각의 객체에 다르게 저장한다.
 * 
 * POJO - Plain Old Java Object -"평범한 옛날 자바 객체"
 * 
 * 객체들의 공통분모 모음 >> 공통분모가 없으면 새로운 Class
 * 객체지향의 5원칙 >> SOLID
 * Single Responsibility Principle	단일책임
 * Open-Closed Principle			개방폐쇄
 * Liskov Substitution Principle	리스코프
 * interface Segregation Principle	인터페이스 분리
 * Dependency Inversion  Principle	의존성역전
 * 
 *	Single Responsibility >> 하나의 클래스는 하나의 목적만 담당 하도록 한다. 
 *	UI담당이면 UI와 관련된 필드와 메소드만 가진다. 
 *	엄격한 클래스 분리를 통해 재사용성을 높인다. 
 * 
 *  클래스가 타클래스의 기능이나 정보가 필요할 때 >> 컨트롤러클래스는 데이터 클래스에 의존적인관계가 된다.
 *  데이터 클래스에 변경이 생기면 컨트롤러도 변경이 되어야한다.
 *  Dependency Injection 의존성주입. 외부클래스에 의존적. 
 *  컨트롤러 클래스가 직접 클래스를 만들어 쓰지않고 외부클래스에서 정보기능받아씀
 *  Spring으로 해결.
 *  
 *  
 * 
 * 
 * 
 */


public class StudentVer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("국어점수 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력: ");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력: ");
		int mat = sc.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.printf("학생의 이름: %s\t국어 점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f" ,name, kor, eng, mat, sum, avg);
		sc.close();
		
		
		
		
		
	}//mainEnd

}//classEnd
