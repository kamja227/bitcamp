package com.bit.day20;

public class Ex01 {
	
	public static void main(String[] args) {
		// Vector
		// 열람만을 위한, 수정 불가능
		java.util.Vector vec01 = new java.util.Vector();
		vec01.addElement("첫번째");
		vec01.addElement("두번째");
		vec01.addElement("세번째");
		vec01.addElement("네번째");
		
		vec01.lastIndexOf("3번째", 2); //
		vec01.removeElementAt(3);
		
		vec01.removeElement("두번째");
		
		java.util.Enumeration em = vec01.elements();
		System.out.println("------------------------");
		Object ele = (String)em.nextElement();
		ele = "1234";
		System.out.println("------------------------");
		java.util.Enumeration em2= vec01.elements();
		
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());			
		}
		
//	 	System.out.println(vec01.elementAt(0));
//		System.out.println(vec01.elementAt(1));
//		System.out.println(vec01.elementAt(2));
//		System.out.println(vec01.elementAt(3));
//		System.out.println(vec01.elementAt(4));

		for(int i=0; i<vec01.size(); i++) {
			System.out.println(vec01.get(i));
		}
	}
}
