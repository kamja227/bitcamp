package com.bit.day16;

public class StudentVO {
	/* field ���� �� java.lang.Object�� �޼ҵ带 �ش� �ʵ忡 ���� �������̵��ϴ� �޼ҵ常 ����. 
	 * 
	 * �����͸� ����ϴ� .Ʋ.�� Value Object(VO) = Data Transfer Object(DTO)��� �Ѵ�. 
	 * �� Ŭ������ �̸��� StudentVO class�� �Ǿ���Ѵ�.
	 * 
	 * coding�Ҷ� �ܺΰ� �˾ƾ� �ϴ� �޼ҵ尡 �ƴ϶�� private�� ����Ѵ�
	 * StudentVO�� ���� �ܺο��� �̿��ؾ��ϹǷ� public���.
	 * 
	 * 
	 * �ʿ��� �޼ҵ常 �ܺο� �����ϰ� ������������ڸ� private�� �ְ�
	 * �޼ҵ�θ� ������ �����ϰ� �ϴ°��� ĸ��ȭ��� �Ѵ�. 
	 * 
	 */
	
	private String name;
	private int kor, eng, math, id;
	//�ʵ忡 ���� �ִ� �޼ҵ� >> setter
	//�ʵ忡 ���簪�� �޴� �޼ҵ� >> getter
	//�� ��ü��  returnValue�� ���´�
	public String getName() {
		return name;
	}

	public void setName(String name) {	//���콺 ��Ŭ�� source > generate getter&setter
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//public void set�ʵ��(�ʵ�Ÿ�� �ʵ��̸�){
	//	this.�ʵ�� = �ʵ��̸�
	//}
	
	//parameter�� ��� Ŭ������ ��ü�� �Ѿ�� �� �ִ�. 
	//��� Ŭ������ ��ü�� �Ű������� �޴� �޼ҵ带 ����� ��
	//1. ��� Ŭ������ ���� �� Overload ���ش�. >> ��ǻ� �Ұ�
	//2. ������ �̿�  polymophsm  >>Object class >>��� Ŭ������ ����Ŭ����
	// ������ Ŭ���� Ÿ���� �Ű������� �޴� �޼ҵ�� �� Ŭ������ ��� �ڼ�Ÿ���� Ŭ������ �Ű������� ���� �� �ִ�. 
	//
	
	
	@Override
	public String toString() {
		return  "id=" + id+ "name=" + name + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math;
	}

	public boolean equals(Object o){
		//2���� ��ü�� ���� �� ������ �˾ƺ��� ���
		//���� Ŭ������ ��ü�� ��� >> �ش� Ŭ���� �ʵ� �� Ư�� field Ȥ�� ��� field�� ���ؼ� ��δ� ������ �ΰ��� ���� ��ü�̴�.
		//
		//�� ��ü�� ���� Ŭ������ ��ü���� Ȯ���ϴ� ���
		//parameter o �� null�� �ƴϰ� StudentVO Ŭ������ ��ü���� Ȯ���غ���.
		//instanceof �̿� o�� studentVO�� ��ü�̸� true�̴� 
		
		if(o instanceof StudentVO){
		//Object o�̱� ������ StudentVO�ʵ带 ������ �� ��� 
		//����� ����ȯ�� ���� studentVO��ü�� ���� ���� �� �ִ�.
			StudentVO s = (StudentVO)o;
			if(id==s.id){
				return true;
			}
		}
		
		
		
		return false;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	
}
