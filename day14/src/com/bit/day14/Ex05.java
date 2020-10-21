package com.bit.day14;

interface Inter05 extends Inter04, Inter03{ //interface끼리는 implement아니고 extends
	//클래스의 네이밍 규칙과 같음
	//첫번째 대문자 
	void func02(); 
	void func01();
}



class Lec05 {
} // 한 문서에 두개 이상의 클래스일떄 public을 여러개 쓸 수 없음

public class Ex05 implements Inter01,Inter02,Inter03{

	public static void main(String[] args) {
		
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

}
