 package com.bit.day14;

abstract class Lec01 {
	public abstract void func01();
}

class Lec11 extends Lec01 {
	public void func01() {
		System.out.println("��������");
	}
}


public abstract class Ex01 { //abstract������ �߻�Ŭ���� ����
	//�߻�Ŭ����
	// - �߻�޼��带 0�� �̻� ���� Ŭ���� //0���� ���� : �߻�޼��带 ���� �ʴ� �߻�Ŭ������ ����
	// - �߻�޼��� - �޼����� ����(0), ����(x)
	
	
	//public abstract void func01(); //;����

	public static void main(String[] args) {
	
		Lec11 lec = new Lec11();
		lec.func01();
		
	}
}
