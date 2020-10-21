package com.bit.me01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_2 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		
		int c;
		try {
			fout = new FileWriter(".\\test.txt");
			while((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
