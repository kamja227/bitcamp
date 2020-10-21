package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex11 extends Frame {
	static java.awt.TextField tf1;
	
	public Ex11() {
		Font font = new Font(Font.MONOSPACED, Font.BOLD, 22);
		Panel p = new Panel();  // default flowlayout
		p.setBackground(Color.BLUE);
		tf1 = new TextField(5); // TextFile 창크기, 글자 사이즈 아님
		
//		tf1.setText("abcdefghijklmnop");
		tf1.setText("");
		tf1.setEchoChar('@'); // 이걸로 나옴 ex)비밀번호
		p.add(tf1);
		
		Button btn = new Button("버튼");
		btn.setFont(font);
//		btn.setSize(100, 100); // 안됨 // 배치관리자를 통해서만 제어 가능
 		p.add(btn);
		
//		add(tf1); // 개행 안됨 ex) 검색창
		add(p);
		// 1920 * 1080
		setLocation(1920/2 - 500/2, 1080/2 - 300/2);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
		try {
			Thread.sleep(5000); // 5초뒤 콘솔 표시됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tf1.getText());
	}
}
