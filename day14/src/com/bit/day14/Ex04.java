package com.bit.day14;
//인터페이스

interface Inter01 { //클래스 아님 생성자 없음(Inter(); 불가능)
	// 오직 추상메서드만을 갖는다 따라서 abstract 생략가능
	// 객체 생성이 불가능(?)하고 따라서 생성자와 필드도 없다
	// 예외) public static final 변수만 가능
	// 예외) 메서드 앞에 public abstract 생략가능
	
	
	public static final int su1 = 1111;
	static final int su2 = 2222;
	final int su3 = 3333;
	int su4 = 4444;
	//생략 가능 
	
	
	public abstract void func01();
	public void func02();
	void func03(); // 접근제한자 default(x), public(o)을 생략한거임
	//private 안됨
}
interface Inter02{}
interface Inter03{}
//비어있는 inter0203 씀 . 클래스의 정보
//분류, 제약


public class Ex04 extends Object implements Inter01, Inter02, Inter03 { //extends아님 interface는 implements
	//class의 다중상속 불가능 interface의 다중상속 가능

	public static void main(String[] args) {
		Inter01 me = new Ex04();
		me.func01();
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3); //static 키워드 뺐는데도 
		System.out.println(Inter01.su4);
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}
} //
