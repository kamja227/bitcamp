package com.bit.day12;

public class Registration03 {

	public static void main(String[] args) {
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		String input = null;
		System.out.print("�ֹι�ȣ�Է�:");
		input = sc.nextLine();
		
		char[] ju1 = new char[6];
		char[] ju2 = new char[7];
		
		try {
			for (int i=0; i<ju1.length; i++) {
				ju1[i] = (char)('0' + Integer.parseInt("" + input.charAt(i))); //
			}
			
			if (input.charAt(6) != '-') {
				Exception err = new Exception();
				throw err;
			} //�ϸ� catch�� �Ѿ
			
			for (int i=0; i<ju2.length; i++) {
				ju2[i] = (char)('0' + Integer.parseInt("" + input.charAt(i + ju1.length + 1)));
			}
		} catch (Exception e) {
			System.out.println("�ٽ� Ȯ���Ͻð� �Է����ּ���");
		}
		
		System.out.println("ó�� �Ϸ�");
	}

}
