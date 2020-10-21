package com.bit.me01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex16 extends Frame {
	
	Ex16() {
		java.awt.GridBagLayout layout = new GridBagLayout();
		
		Panel p = new Panel();
		p.setLayout(layout);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		
		Button btn1 = new Button("ac");
		Button btn2 = new Button("*");
		Button btn3 = new Button("/");
		Button btn4 = new Button("+");
		Button btn5 = new Button("7");
		Button btn6 = new Button("8");
		Button btn7 = new Button("9");
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0; // ¥√æÓ≥µ¿ª∂ß ∫Ò¿≤
		c.weighty = 1.0;
		layout.setConstraints(btn1, c);
		p.add(btn1);
		
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0; // ¥√æÓ≥µ¿ª∂ß ∫Ò¿≤
		c.weighty = 1.0;
		layout.setConstraints(btn2, c);
		p.add(btn2);
		
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		layout.setConstraints(btn3, c);
		p.add(btn3);
		
		c.gridx = 3; // ¡¬«•
		c.gridy = 0;
		c.gridwidth = 1; // ±‚¡ÿ¿« ≥–¿Ã 2ƒ≠
		c.gridheight = 2; // ±Ê¿Ã 2ƒ≠
		c.weightx = 1.0;
		c.weighty = 1.0;
		layout.setConstraints(btn4, c);
		p.add(btn4);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		layout.setConstraints(btn5, c);
		p.add(btn5);
		
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		layout.setConstraints(btn6, c);
		p.add(btn6);
		
		c.gridx = 2; // ¡¬«•
		c.gridy = 1;
		c.gridwidth = 1; // ±‚¡ÿ¿« ≥–¿Ã 2ƒ≠
		c.gridheight = 1; // ±Ê¿Ã 2ƒ≠
		c.weightx = 1.0;
		c.weighty = 1.0;
		layout.setConstraints(btn7, c);
		p.add(btn7);
		
		
//		
//		for(int i=0; i<15; i++) {
//			String num = null;
//			num = i+"";
//			Button btn = new Button(num);
//			c.gridx = i;
//			c.gridy = i;
//			c.gridwidth = 1;
//			c.gridheight = 1;
//			c.weightx = 1.0; // ¥√æÓ≥µ¿ª∂ß ∫Ò¿≤
//			c.weighty = 1.0;
//			layout.setConstraints(btn, c);
//			p.add(btn);
//		}
		
		
		
		
		add(p);
		setLocation(200, 200);
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex16();
	}
}
