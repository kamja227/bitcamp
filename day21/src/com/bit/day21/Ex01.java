package com.bit.day21;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// IO
		// File
		
		// 절대경로
//		String path = "C:\\javaWorkspace\\day21\\text01.txt";
//		String path = "C:\\javaWorkspace\\day21\\src";
		String path = "C:\\javaWorkspace\\day20";
		
		// 상대경로 //앞에 .\ 생략
//		String path = "test01.txt"; // .\test01.txt와 같음
//		String path = "."; // 현재 디렉토리
//		String path = ".."; // 상위 디렉토리
//		String path = "..\\day21\\test01.txt";  
//		String path = "..\\day21\\src"; 
//		String path = "No"; // 주의
		
		java.io.File file = new java.io.File(path);
		
		System.out.println("파일이 존재하는가? " + file.exists()); 
		System.out.println("파일인가? " + file.isFile());
		System.out.println("디렉토리인가? " + file.isDirectory());
		System.out.println("이름은? " + file.getName());
		System.out.println("경로는? " + file.getPath()); // 상대경로를 절대경로로 뽑아내지 못함
		System.out.println("단순 절대경로는? " + file.getAbsolutePath());
		try{
		System.out.println("일반 절대경로는? " + file.getCanonicalPath()); 
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Path는? " + file.getParent());
		System.out.println("rwx r읽기권한? " + file.canRead());
		System.out.println("rwx w쓰기권한? " + file.canWrite());
		System.out.println("rwx x실행권한? " + file.canExecute());
		System.out.println("size? " + file.length() + "byte");
		System.out.println("최종수정시간? " + new java.util.Date(file.lastModified()));
		String[] dirs = file.list();
		System.out.println(java.util.Arrays.toString(dirs));
		for(int i=0; i<dirs.length; i++) {
			System.out.println(dirs[i]);
		}
		
		
	}
}
