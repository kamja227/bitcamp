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
//		java.awt.TextArea ta = new TextArea(3, 20); // (세로, 가로)
//		java.awt.TextArea ta = new TextArea("초기값",3 ,20, 3); //("", , 1) 가로스크롤 없어짐 (개행) ("", , 2) 세로 ("", , 3) 둘다
		java.awt.TextArea ta = new TextArea("초기값",3 ,20, TextArea.SCROLLBARS_BOTH); // 양쪽 스크롤 상수
//		ta.setText("출력\n두번째줄");
//		ta.setVisible(false); // 타이핑 창 안보여줌
//		ta.setEditable(false); // 타이핑 안됨
//		ta.setEnabled(false); // 타이핑 안됨 선택 안됨, 존재하지만 비활성화
		p.add(ta);
		
		Button btn = new Button("버튼");
//		btn.setVisible(false); // 버튼 안보여줌
		btn.setEnabled(false); // 버튼 클릭 안됨
		
//		ta.setColumns(10); // 세로
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
