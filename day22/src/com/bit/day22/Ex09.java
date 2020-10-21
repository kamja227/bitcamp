package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex09 extends Frame {
	// UI
	
	Ex09() {
		Panel p = new Panel();
		Panel p2 = new Panel();
//		p2.setBackground(Color.red);
//		Color color = new Color(255, 0, 0); // (r, g, b)
//		p2.setBackground(color);
		p.setLayout(new GridLayout(1,2));

		Label la1 = new Label();

		Button btn1 = new Button();
		btn1.setLabel("한글"); // 버튼에 출력
		
		Font font = null;
		font = new Font(Font.SANS_SERIF, Font.BOLD, 22); // ("폰트명", Style, 폰트크기)
		btn1.setFont(font);

		la1.setText("출력합니다");
		la1.setFont(font);
		
		p.add(btn1);
		p2.add(la1);
		p.add(p2);
		add(p);
		
		setLocation(200, 200);
		setSize(500, 300);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new Ex09();	
	}
	
	
}
