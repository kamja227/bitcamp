package com.bit.day20;
//Ex13

class Com {
	void play() {
		System.out.print("������ ���� ���");
	}
}
class Ball {
	String color = "������";
	void play() {
		System.out.print(this.color + "���� �������ϴ�"); // this ����
	}
}
class BaseBall extends Ball {
	String color  = "���";
	void play() {
		System.out.print(" ������ ����� �ֽ��ϴ�");
	}	
}
class Bowling extends Ball {
	String color = "��Ȳ��";
	void play() {
		System.out.print("���� ���� ");
		super.play();
	}
}

class Box<T>{
	private T myBall;
	
	void push(T myBall) {
		this.myBall = myBall;
	}
	T pull() {
		return myBall;
	}
}

public class Ex08 {
	// ���׸�
	public static void main(String[] args) {
		BaseBall ball = new BaseBall();
		Bowling bow = new Bowling();
		Com com = new Com();
		
		Box<BaseBall> box = new Box<BaseBall>();
		box.push(ball);
		
		BaseBall ball2 = box.pull();
		ball2.play();
	}
}
