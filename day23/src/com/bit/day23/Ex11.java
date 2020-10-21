package com.bit.day23;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex11 extends Frame implements MouseListener {
	// double click

	int cnt;
//	long time;
	long before, after;
	
	public void mouseClicked(MouseEvent e) {
		cnt ++;
		
		if(cnt == 1) {
			before= System.currentTimeMillis();
		} else if(cnt == 2) {
			after = System.currentTimeMillis();
			if(after - before < 1000) { // 1��
				System.out.println("double click");
				cnt = 0;
			} else {
				before = after;
				cnt = 1;
			}
		}
	}

	public Ex11() {
		
		addMouseListener(this);
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}
