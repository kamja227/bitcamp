package com.bit.me01;

import java.net.*;
import java.io.*;
import java.util.*;

public class CardHali {
	static int cnt = 0;
	static int[][] allCard = new int[4][14];
	static String[] card2;

	public void cardShuffle(int[][] arr, int count) {
		String[][] card = new String[4][14];
		card2 = new String[56];
		int card2Length = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				allCard[i][j] = j;
			}
		} // outforEnd
		
		for (int i = 0; i < 4; i++) {// 인자앞에 과일종류붙여서 문자열변환, 배열복사.
			for (int j = 0; j < 14; j++) {
				card[i][j] = i + "" + arr[i][j];
			}
		} // outforend
			
		for (int i = 0; i < 4; i++) {// 인자앞에 과일종류붙여서 문자열변환, 배열복사.
			for (int j = 0; j < 14; j++) {
				card2[card2Length] = card[i][j];
				card2Length++;
			}
		} // outforend
			
		for (int k = 0; k < count; k++) {
			int i = (int) (Math.random() * card2.length);
			int j = (int) (Math.random() * card2.length);
				
			String tmp = card2[i];
			card2[i] = card2[j];
			card2[j] = tmp;
		}
		
	}// cardShuffle
	public static void main(String[] args) {
		CardHali card = new CardHali();
	}
} // cardend
		

