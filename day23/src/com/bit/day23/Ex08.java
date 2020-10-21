package com.bit.day23;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex08 extends Frame implements MouseMotionListener{
	// MouseMotion
	
	public Ex08() {
		Panel p = new Panel();
		p.addMouseMotionListener(this); // panel기준일때 창부터 0,0
		add(p);
//		addMouseMotionListener(this); // frame기준일땐 
		
		System.out.println(p.getWidth() + "," + p.getHeight());
		setSize(500, 500);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Drag x=" + x + ", y=" + y); 
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved");	
	}
	
} // class end
