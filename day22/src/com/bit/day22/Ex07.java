package com.bit.day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");		
		
		for(int i=0; i<1000; i++) {
			Date date = new Date();
			String msg = sdf.format(date);
			System.out.println(msg);
			
			try {
				Thread.sleep(1000, 999); // (밀리,나노)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
} 
