package com.bit.day14;

abstract class Machine {
	abstract void work(); // mashineŬ������ ��ӹ޴� ��� Ŭ������ ��ũ�� �������̵��ؾߵ�

	
	
	void on() {
		System.out.println("ȯ���մϴ�");
	}

	void off() {
		System.out.println("������ �����մϴ�");
	}
}

class Tv extends Machine {

	@Override
	void work() {
		System.out.println("������ ����ش�");

	}

}

class Radio extends Machine {
	void work() {
		System.out.println("���ļ��� ��� �Ҹ��� ����ش�");
	}
}

class Audio extends Machine {

	@Override
	void work() {
		System.out.println(" ");

	}
}

public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Machine remote = null;
		
		while(true) {
			System.out.print("1. tv 2. radio 3.audio 0.���� >> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			} else if(input == 1) {
				remote = new Tv();
			} else if(input == 2) {
				remote = new Radio(); 
			}	else if(input == 3) {
					remote = new Audio();
				}
			}
		}
	
	}
