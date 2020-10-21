package com.bit.day23;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame {

	public Ex03() {
		
		setSize(800, 600);
		setLocation(200, 200);
//		setVisible(true);
		
//		java.awt.Dialog dia = new Dialog(this, "새창");
//		java.awt.FileDialog dia = new FileDialog(this, "새창", FileDialog.SAVE); // 문서, 저장(1)
		java.awt.FileDialog dia = new FileDialog(this, "새창", FileDialog.LOAD); // 문서, 열기(0) 
		
//		dia.add(new Button("버튼"));
		dia.setSize(200, 100);
		dia.setLocation(200+800/2-200/2, 200+600/2-100-2/2); // 10번줄
		dia.setVisible(true);
		System.out.println(dia.getDirectory()); // 저장한 directory 경로 뜸
		System.out.println(dia.getFile()); // 검색한 정보 뜸
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
