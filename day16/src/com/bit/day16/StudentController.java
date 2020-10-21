package com.bit.day16;

import java.util.ArrayList;
import java.util.List;
//��Ʈ�ѷ��� ui�� VO�� ���� �����ؼ� �����ְų�
//ui���� �Է¹��� ���� vo�� ��� �����ͺ��̽��� �����ִ� ������ ��
//�츮�� db�� ���� ������ �׳� ��հ� ������ ����ϴ� �޼ҵ常 �־���

public class StudentController {
	/*
	 * VO�� ���� �����ؼ� UI�� �����ų� �Է¹��� ���� VO�� ��� DB�� �����ִ� ���� DB�� �����Ƿ� ��հ� ������ �Ի��ϴ�
	 * �޼ҵ常 �־��ش�.
	 */
	/*
	 * �޼ҵ带 ���� DI ���� �����ڸ� ���� DI�� �غ����� ���� ������ list�� �츮�� �ʿ��Ҷ����� db���� �ܾ�;� ������ ������
	 * �츮�� db�� �����Ƿ� ���⿡ �ʵ�� �ִ´� ���� solymorphism�� Ȱ���ϱ� �̤��� data type�� arrayList��
	 * �ƴ� List�� �ִ´�
	 */
	
	List<StudentVO> list;

	public StudentController(List<StudentVO> list) {
		// �� ��Ʈ�ѷ� Ŭ������ List<StudentVO> list�� �������� �����̴�.
		// �׷��ٰ� �ؼ� �� ����Ʈ�� ��� �ʱ�ȭ������ ���⿡ �����ָ�
		// ���� �� ����Ʈ�� ������ �������� �ȴٸ� ���⵵ ����־�߸� �Ѵ�
		// ������ �ܺο��� ����Ʈ�� �����ϰԵȴٸ� ���⼭�� �׳�
		// �ʱ�ȭ �ڵ常 �ֱ� ������ �� ���Թ��� ���� �״�� ���⸸ �ϸ� �ȴ�
		// �̷��� ������ �ٷ� ������ ������ �ȴ�
		this.list = list;
	}

	public int operateSum(StudentVO s) {
		return s.getEng() + s.getKor() + s.getMath();
	}

	public double operateAvg(StudentVO s) {
		return operateSum(s) / 3.0;
	}

	public StudentVO findById(StudentVO s) {
		StudentVO result = null; // ����Ʈ�� ���� �л������� �䱸�� ��� null�� ���ϵȴ�.
		if (list.indexOf(s) != -1) { // list �� element�� �ִ°�� true
			int idx = list.indexOf(s);
			result = list.get(idx);
		}
		return result;
	}
	public void add(StudentVO s) {
		if(list.size() == 0) {
			s.setId(0);
		} else {
			int id = list.get(list.size() - 1).getId() + 1;
			s.setId(id);
		}
		list.add(s);
	}
	public void set(StudentVO s) {
		int index = list.indexOf(s);
		list.set(index, s);
	}
	public void remove(StudentVO s) {
		list.remove(s);
	}
}
