package com.bit.day23;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex04 extends Frame {
	// Canvas // x
	class MyCanvas extends Canvas {
		public void paint(Graphics g) {
			g.drawString("welcome", 800/2, 600/2); // 글자가 아니라 자바가 그린 이미지
			
			g.setColor(Color.RED);
			g.drawLine(100, 100, 200, 200); // 선
			g.drawRect(300, 100, 100, 100); // 네모
			
			g.setColor(Color.BLUE);
		
			g.drawOval(500, 100, 100, 150);
			g.drawArc(100, 400, 200, 200, 0, 180);
			g.fillOval(500, 100, 100, 150);
			g.fillArc(0, 300, 200, 200, 0, 90);
		}
	}


	public Ex04() {
		java.awt.Canvas can = new MyCanvas();
		add(can);
		
		setSize(800, 600);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
