package com.bit.day22;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex15 extends Frame {
	
	Ex15() {
		Panel p = new Panel();
		
//		java.awt.List list = new List(4);
		java.awt.List list = new List(4,true); // 목록 몇개 보여줄지, 다중선택
		
//		list.add("item1"); // util.list 와 헷갈림
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.addItem("item5");
		list.select(1);
		
		p.add(list);
		add(p);
		java.awt.Dimension dim = new Dimension(500, 300);
		setSize(dim);
		setLocation(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex15();
	}
}
