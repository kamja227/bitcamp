package com.bit.me01;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex07 {
	
	public static void main(String[] args) {
		java.util.Set lotto = new TreeSet();
		java.util.Random ran = new Random();

		while(lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1); // 0~44 +1
		}
		
		Iterator note = lotto.iterator();
		
		while(note.hasNext()) {
			System.out.println(note.next());
		}

		
	}
}
