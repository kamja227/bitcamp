package com.bit.day14;

import java.util.GregorianCalendar;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.GregorianCalendar cal = new java.util.GregorianCalendar(2002,5-1,24,13,30,44);
		System.out.println(cal.toString());
		System.out.print(cal.get(GregorianCalendar.YEAR)+"년");
		System.out.print(cal.get(GregorianCalendar.MONTH)+1+"월");
		System.out.print(cal.get(GregorianCalendar.DATE)+1+"일");
		System.out.print(cal.get(GregorianCalendar.HOUR)+"시");
		System.out.print(cal.get(GregorianCalendar.MINUTE)+"분");
		System.out.println(cal.get(GregorianCalendar.SECOND)+"초");
		
	}

}
