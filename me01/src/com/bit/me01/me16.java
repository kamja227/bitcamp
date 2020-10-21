package com.bit.me01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextField;

public class me16 extends Frame {
	
	public me16() {
		Panel p = new Panel();
		Panel p2 = new Panel();
		String[] names = {"ac","*","/","+",
						  "7","8","9",
						  "4","5","6","-",
						  "1","2","3","=",
						  "0","."
						  };
		Button[] btns = new Button[17];
		
		for(int i=0; i<btns.length; i++) {
			btns[i] = new Button(names[i]);
//			p2.add(btns[i]);
		}
		
		GridBagLayout layout = new GridBagLayout();
		p2.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;

		int cnt = 0;
		while(cnt<17) {
			if(cnt == 3) {
				func(p2, layout, gbc, btns[cnt++], 3, 0, 1, 2);
				continue;
			}
			for(int i=0; i<4; i++) {
				if(i%2 == 0) {
					for(int j=0; j<4; j++) {
						func(p2, layout, gbc, btns[cnt++], j, i, 1, 1);				
					}
				} else {
					for(int j=0; j<3; j++) {
						func(p2, layout, gbc, btns[cnt++], j, i, 1, 1);				
					}
				}
			}
		}
		func(p2, layout, gbc, btns[14], 3, 3, 1, 2); //= 
		func(p2, layout, gbc, btns[15], 0, 4, 2, 1); //0
		func(p2, layout, gbc, btns[16], 2, 4, 1, 1); //.
		
//		func(p2, layout, gbc, btns[14], 3, 2, 2, 1); //= 
//		func(p2, layout, gbc, btns[15], 0, 2, 1, 1); //0
//		func(p2, layout, gbc, btns[16], 2, 4, 1, 1); //.
		
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH, new TextField());
		p.add(BorderLayout.CENTER, p2);
				
		add(p);
		setLocation(200, 200);
		setSize(300, 500);
		setVisible(true);
		
	}
	public void func(Panel p2, GridBagLayout layout, GridBagConstraints gbc, 
						Button btn, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		layout.setConstraints(btn, gbc);
		p2.add(btn);
	}
	
	public static void main(String[] args) {
		new me16();
	}
}