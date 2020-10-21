package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex15 extends Frame {
	// 배치관리자
	Ex15() {
		java.awt.BorderLayout layout = new BorderLayout();
		java.awt.FlowLayout layout2 = new FlowLayout();
		Panel p = new Panel(); // 그룹집..?
		p.setLayout(layout);

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Panel west = new Panel();
		west.setLayout(layout2);
		Button btn4 = new Button("버튼4");
		west.add(btn4);
		Panel center = new Panel();
		west.setLayout(layout2);
		Button btn5 = new Button("버튼5");
		center.add(btn5);
		
//		p.add(btn1, "North"); // 기억못해서 34줄부터, 상수로 정의해놓음
//		p.add(btn2, "South");
//		p.add(btn3, "East");
//		p.add(btn4, "West");
//		p.add(btn5, "Center");
		
		p.add(BorderLayout.NORTH, btn1);
		p.add(BorderLayout.SOUTH, btn2);
		p.add(BorderLayout.EAST, btn3);
		p.add(BorderLayout.WEST, btn4);
		p.add(BorderLayout.CENTER, btn5);

		add(p);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex15();
	}
}
