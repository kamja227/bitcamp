package com.bit.day16;

public class StudentArrayUtil {
	// StudentVO �����Ҵ� �迭size������� ����Ҽ��ְ�.

	private static StudentVO[] expand(StudentVO[] arr) { // �迭ũ�� �÷��ִ� ����
		StudentVO[] temp = new StudentVO[arr.length];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = new StudentVO[temp.length + 1];

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

	public static StudentVO[] add(StudentVO[] arr, StudentVO s) {

		arr = expand(arr); // arr�迭 ũ�� �ϳ��ø��� �޼ҵ�
		arr[arr.length - 1] = s;

		return arr;
	}

	@Override
	// ���콺 ��Ŭ�� > source > override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	// �迭���� �ش簴ü�� ���° �ε������� �˷��ִ� �޼ҵ�
	// ��ü �񱳽ÿ��� �񱳿�����(==)�� �ƴ϶� �޼ҵ带 ���� ���ؾ��Ѵ�
	// �񱳿����ڴ� ���� �ƴ϶� ������ �����ϰ��ִ� �ּҸ� ���Ѵ�.

	// ���°�ε�������Ȯ���Ҷ�
	// ���° �ε������� Ȯ�εǸ� �ε�����ȣ ����.
	// �迭�� ���� �ε����� �䱸�ϴ� ���.
	// �迭���� ������ �� ���� -1�� �����ϰ� ����� �ָ� �ȴ�.

	public static int indexOf(StudentVO[] arr, StudentVO s) {
		
		for (int i = 0; i < arr.length; i++) {
			if (s.equals(arr[i])) {
				return i;
			}
		}
		return -1;	// �迭�� ���� �ε����� �䱸�ϴ� ���.
	}

	/*
	 * �迭���� Ư�� ��ü�� �����ϰ� ũ�⵵ ��ĭ ���̷��� ��� �ؾ��ϴ°�.
	 * 
	 * �ش� �迭�� �� ��ü�� �����ϴ��� üũ�Ѵ�. �������� ���� ��쿣 �迭�� �ٽ� �״�� �����ش�. ������ ��� 2���� �迭�� ����
	 * 0������ �� ��ȣ���� ���� �� ��ȣ���� ������ ���� �׸��� �ΰ��� ��ġ�� ���� �� �ִ�.
	 * 
	 * 
	 * �����迭�� ���迭�� ���� �����迭�� ũ���ϳ��۰� ���� ����� ���迭�� ������ �����ϵ� indexOf�� ���� �ÿ� �������� �ʴ´�.
	 */

	/*
	 * 
	 * */

	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		
		//���� S�� arr�� �����ϴ��� Ȯ��
		if(indexOf(arr, s) != -1){
			//�����ϹǷ� �պκа� �޺κ����� ������ ����.
			int index = indexOf(arr, s);
			
			StudentVO[] temp = new StudentVO[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
				temp[i]=arr[i];							//���� �迭�� �� �迭�� ����.
			}
			arr = new StudentVO[temp.length-1];			//���� �迭�� ũ�⸦ 1�� �ٿ��� ���� �����. 
			for (int i = 0; i < temp.length; i++) {
				if(i<index){
					arr[i] = temp[i];
				}else if(i>index){
					arr[i-1] = temp[i];				
				}
			}//forEnd
		}//OutIfEnd
		
		return arr;
		
	}//removeEnd
}// classEnd

