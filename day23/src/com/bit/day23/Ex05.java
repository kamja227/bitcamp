package com.bit.day23;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame implements WindowListener{
	// Event
	public Ex05() {
		addWindowListener(this);
		
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated"); // 활성화
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		// 저장하시겠습니까 등 후행작업
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing"); // x버튼 // x누른 다음 어떡할건지
//		System.exit(0); // 비권장
		dispose(); 
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated"); // 비활성화 (다른 탭)
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified"); // 다시 열림(비최소화)
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified"); // 최소화(아이콘화)
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");		
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
