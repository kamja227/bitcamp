package com.bit.day12;

public class Ex02 {
	public static void main(String[] args) {
	//����ó��
		String msg="1234";
	
	for (int i=0; i<msg.length(); i++) {
		if (Character.isDigit(msg.charAt(i))) {
		} else {
			System.out.println("���ڰ� �ƴ� ���ڰ� �����ϴ�");
		}
				return ;
		}
		
		try { //������ ��ġ�°� �ƴ� ȸ��
			System.out.println("���� �ٿ��� ������ �߻��Ҽ��� �ֽ��ϴ�");
			Integer su=new Integer(msg);
			System.out.println("������ ������ �����׿�");
			System.out.println("su="+su);
		} catch (NumberFormatException e) {
			System.out.println("������ ��Ƴ½��ϴ�");
		}
		System.out.println("���α׷��� �����߾����ϴ�");

	
	}
} //class end
