package com.bit.day21;

public class Ex11 {

	public static void main(String[] args) {
		// finally
		boolean boo = true;
		try {
			int[] arr = {1, 3, 5};
			System.out.println(arr[3]);
			if(boo) {
				return;
			}
//			System.out.println("�����ϼ̽��ϴ�"); // ������ ���� ���;���
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����ȸ��");
		
		} finally {
			System.out.println("�����ϼ̽��ϴ�");
			// �ݵ�� ������
		}
	}
}
