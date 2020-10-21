package com.bit.day21;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// IO
		// File
		
		// ������
//		String path = "C:\\javaWorkspace\\day21\\text01.txt";
//		String path = "C:\\javaWorkspace\\day21\\src";
		String path = "C:\\javaWorkspace\\day20";
		
		// ����� //�տ� .\ ����
//		String path = "test01.txt"; // .\test01.txt�� ����
//		String path = "."; // ���� ���丮
//		String path = ".."; // ���� ���丮
//		String path = "..\\day21\\test01.txt";  
//		String path = "..\\day21\\src"; 
//		String path = "No"; // ����
		
		java.io.File file = new java.io.File(path);
		
		System.out.println("������ �����ϴ°�? " + file.exists()); 
		System.out.println("�����ΰ�? " + file.isFile());
		System.out.println("���丮�ΰ�? " + file.isDirectory());
		System.out.println("�̸���? " + file.getName());
		System.out.println("��δ�? " + file.getPath()); // ����θ� �����η� �̾Ƴ��� ����
		System.out.println("�ܼ� �����δ�? " + file.getAbsolutePath());
		try{
		System.out.println("�Ϲ� �����δ�? " + file.getCanonicalPath()); 
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Path��? " + file.getParent());
		System.out.println("rwx r�б����? " + file.canRead());
		System.out.println("rwx w�������? " + file.canWrite());
		System.out.println("rwx x�������? " + file.canExecute());
		System.out.println("size? " + file.length() + "byte");
		System.out.println("���������ð�? " + new java.util.Date(file.lastModified()));
		String[] dirs = file.list();
		System.out.println(java.util.Arrays.toString(dirs));
		for(int i=0; i<dirs.length; i++) {
			System.out.println(dirs[i]);
		}
		
		
	}
}
