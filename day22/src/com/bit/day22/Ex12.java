package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex12 extends Frame {

	public Ex12() {
		Panel p = new Panel();
		p.setBackground(Color.BLUE);
//		java.awt.TextArea ta = new TextArea(3, 20); // (����, ����)
//		java.awt.TextArea ta = new TextArea("�ʱⰪ",3 ,20, 3); //("", , 1) ���ν�ũ�� ������ (����) ("", , 2) ���� ("", , 3) �Ѵ�
		java.awt.TextArea ta = new TextArea("�ʱⰪ",3 ,20, TextArea.SCROLLBARS_BOTH); // ���� ��ũ�� ���
//		ta.setText("���\n�ι�°��");
//		ta.setVisible(false); // Ÿ���� â �Ⱥ�����
//		ta.setEditable(false); // Ÿ���� �ȵ�
//		ta.setEnabled(false); // Ÿ���� �ȵ� ���� �ȵ�, ���������� ��Ȱ��ȭ
		p.add(ta);
		
		Button btn = new Button("��ư");
//		btn.setVisible(false); // ��ư �Ⱥ�����
		btn.setEnabled(false); // ��ư Ŭ�� �ȵ�
		
//		ta.setColumns(10); // ����
		ta.setRows(10);
		
		p.add(btn);
		
		add(p);
		setLocation(200, 200);
		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex12();
	}
}
