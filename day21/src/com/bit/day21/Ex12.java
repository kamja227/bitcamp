package com.bit.day21;

public class Ex12 {
	
	public static void main(String[] args) {
		// ��ġ������
		// ������Ʈ ������ҵ� Ȯ��
		// ��ɺο� (�̺�Ʈ ó��)
		
		
		java.awt.Frame frame = new java.awt.Frame();
//		javax.swing.JFrame frame = new javax.swing.JFrame(); // awt -> swing Frame ->JFrame
		
		java.awt.Button btn01 = new java.awt.Button();
		btn01.setLabel("��ư�Դϴ�");
		frame.add(btn01);
		
		java.awt.Button btn02 = new java.awt.Button();
		btn02.setLabel("�ι�° ��ư");
		frame.add(btn02);
		
		
		frame.setSize(500, 300); //�ȼ�����
		frame.setLocation(500, 500);
		frame.setVisible(true); // ȭ�麸�̱�
		
	}
}


