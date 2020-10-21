package com.bit.day16;

import java.util.ArrayList;

/*
 Collection Framework���� ���� ������ ���� ��ü�� �ѹ��� �ٷ� �� �ְ� ���ִ� �پ��� Ŭ���� ����
 �� �� �ϳ��� ArrayList

 */

public class StudentEx02 {

	public static void main(String[] args) {
		
		ArrayList<StudentVO> list = new ArrayList<>();
		
		//< >���ø����� list�� type�� ����. 
		//StudentVO class type�� element�� ���� list
		//StudentVO()��ü�� ����� add()�� arrayList<StudentVO> list�� ����ȴ�. 
		
		// < > : template
		// �ش� �ݷ��� ��ü�� ���� Ŭ������ �������� �����Ѵ�. ���ø����� Ŭ������ �� �� �ִ�.
		// collerction framework�� �ּҰ��� �̿��� ���� �� ��ҵ��� ��Ʈ���ϹǷ� �ּҰ��� ���� �⺻�������ʹ� ��
		// �� ����.
		// ���� �⺻���� wrapper class�� �̿���.
		// collection Framework�� equals() �޼ҵ带 ���ο��� ���ػ���Ѵ�.
		// collection Framework�� ����ִ� Ŭ������ Ȱ���ϱ� ���ؼ��� ����ڰ� ���� Ŭ������
		// equals()�޼ҵ带 �������̵� �ϴ� ���� �ſ� �߿��ϴ�.
		// java.lang.Object�� equals()�޼ҵ��
		// Parameters:c - the collection whose elements are to be placed into
		// this list

		// arraylist�� ũ�Ⱑ �ڵ����� ����. ����ũ��� size()�޼ҵ� �̿�.

		
		System.out.println("List�� ����ũ�� : " + list.size());
		StudentVO s = new StudentVO();
		s.setName("����");
		s.setKor(88);
		s.setEng(64);
		s.setMath(54);

		StudentVO s2 = new StudentVO();
		s2.setName("����2");
		s2.setKor(88);
		s2.setEng(64);
		s2.setMath(54);
		
		StudentVO s3 = new StudentVO();
		s3.setName("����3");
		s3.setKor(88);
		s3.setEng(64);
		s3.setMath(54);
		
		StudentVO s4 = new StudentVO();
		s4.setName("����4");
		s4.setKor(88);
		s4.setEng(64);
		s4.setMath(54);
		
		StudentVO s5 = new StudentVO();
		s5.setName("����5");
		s5.setKor(88);
		s5.setEng(64);
		s5.setMath(54);
		
		list.add(s);
		System.out.println("List�� ����ũ�� : " + list.size());
		list.add(s2);
		System.out.println("List�� ����ũ�� : " + list.size());
		list.add(s3);
		System.out.println("List�� ����ũ�� : " + list.size());
		list.add(s4);
		System.out.println("List�� ����ũ�� : " + list.size());
		list.add(s5);
		System.out.println("List�� ����ũ�� : " + list.size());
		
/*		Ư����ġ�� �������� ���
		���� �� ��ȣ�� �ִ� ��ü�� �ϳ��� �ڷ� �и���. 
		�� ��ġ�� �Ű������� �ѱ� ��ü�� ����. 
		add(index, element)*/
		
		StudentVO s6 = new StudentVO();
		s6.setName("����6");
		s6.setKor(88);
		s6.setEng(64);
		s6.setMath(54);

		System.out.println("index 2�� studentVO�� getName" + list.get(2).getName());
		//studentVO��ü���� ���� list���� 2��° ��ü�� ������ �ִ� Name���� ȣ��
		System.out.println("list.add(2, s6);");
		list.add(2, s6);
		System.out.println("index 2�� studentVO�� getName" + list.get(2).getName());
		System.out.println("List�� ����ũ�� : " + list.size());
		
			//list���� �ش簴ü�� index�� ���� ��
		System.out.println("s5�� list Index : "+list.indexOf(s5));
		System.out.println("s4�� list Index : "+list.indexOf(s4));

		System.out.println("s3�� list Index : "+list.indexOf(s3));
		System.out.println("s6�� list Index : "+list.indexOf(s6));
		System.out.println("s2�� list Index : "+list.indexOf(s2));
		System.out.println("s1�� list Index : "+list.indexOf(s));
		
	//	�ش� ��ü�� ���ϰ�ü�� ������ ������ ���� �տ� �ִ� ��ü�� index�� �����Ѵ�. 
		list.add(s3);
		list.add(s3);
		list.add(s3);
		System.out.println("s3�� list Index : "+list.indexOf(s3)); //���� ���� s3�� �ε����� ���. 
		System.out.println("List�� ����ũ�� : " + list.size());
		
		//���� ������  ��ü�� index
		System.out.println("s3�� list lastindex : "+list.lastIndexOf(s3));
		
		//list�� ã�� ��ü�� �����ϴ��� ���ϴ��� Ȯ�� �ϴ� ��� contains() true of false
		System.out.println("list�� s2�� �����ϴ°� : " + list.contains(s2));
		
		//indexOf. lastIndexOf. contains. �������� �ʴ� ��ü�� �䱸�ϸ� 
		// -1    	-1			 false      << returnValue
		
		
/*		list���� ������ ��
		1. �ش� �ε��� ����
		2. �ش� ��ü�� ��ġ�ϴ� elements �߿��� ���� �չ�ȣ ���� 

*/
		System.out.println("List�� ����ũ�� : " + list.size());
		list.remove(0);		//index 0�� ���� 
		System.out.println("list�� s�� �����ϴ°� : " + list.contains(s));
		System.out.println("List�� ����ũ�� : " + list.size());
		list.remove(s3);  //Removes the first occurrence of the specified element from this list,if it is present. 
						//�ش� ��ü�� ������ false���� ������ true
		System.out.println("List�� ����ũ�� : " + list.size());
		
		StudentVO s60 = new StudentVO();
		s60.setName("����6");
		s60.setKor(88);
		s60.setEng(64);
		s60.setMath(54);
		//list.remove(s60) >> parameter�� ����Ű�� data�� list�� �����ϸ� true�� ����, �ƴ� ��� false
		if(list.remove(s60)){ //s60������ s6�� ���� �����̹Ƿ� true�� ���ϵǾ� if���� �����.
			System.out.println("remove(s60) >> s6�� ��� ������");
		}
		//remove >> (s==null ? get(i)==null : s.equals(get(i)))
		System.out.println("list�� s6�� �����ϴ°� : " + list.contains(s6)); //false list�� �����Ƿ�.
		System.out.println("s6�� list Index : "+list.indexOf(s6)); // -1 
		
		//���������� equals()�޼���� ���ϹǷ� s60�� s6 ������ ���⶧���� remove(s60)���� s6�� ����Ʈ���� ������.
		
	}
}
