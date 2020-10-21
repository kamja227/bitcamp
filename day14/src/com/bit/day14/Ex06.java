package com.bit.day14;

interface Remote {
	void on();
	void off();
	void work();
}

class Tv2 implements Remote {

	@Override
	public void on() {
		System.out.println("������ �����Ѵ�");
	}

	@Override
	public void off() {
		System.out.println("������ �����Ѵ�");
	}

	@Override
	public void work() {
		System.out.println("ȭ���� ����");
	}
	
}

class Radio2 implements Remote {
	
	@Override
	public void on() {
		System.out.println("�嵥���� ���� ������ �����Ѵ�");
	}
	@Override
	public void off() {
		System.out.println("�嵥���� ���� ������ �����Ѵ�");	
	}
	@Override
	public void work() {
		System.out.println("���ļ��� ã�� �Ҹ��� ����Ѵ�");	
	}
}


public class Ex06 {

	public static void main(String[] args) {
		
		Remote remote = null;
		
		remote = new Tv2();
		remote.on();
		remote.work();
		remote.off();
		remote = new Radio2();
		remote.on();
		remote.work();
		remote.off();
	}
}

