package com.bit.day12;

public class Ex03 {
	public static void main(String[] args) {
		String msg = "4";
		int[] arr = new int[10]; // arr

		try {
			int su = Integer.parseInt(msg); // ���ڷ� �ٲ�
			double su2 = 10.0 / su;

			arr[su] = (int) su2; // arr

			System.out.println("10/" + msg + "=" + su2);

		} catch (NumberFormatException e) {
			System.out.println("���ڷθ� �Է��ϼ���");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("�迭�� �ε����� ���� ������ ȣ���Ͽ����ϴ�");
		}
	}
}
