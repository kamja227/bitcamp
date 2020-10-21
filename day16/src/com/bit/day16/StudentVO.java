package com.bit.day16;

public class StudentVO {
	/* field 정의 후 java.lang.Object의 메소드를 해당 필드에 맞춰 오버라이딩하는 메소드만 들어간다. 
	 * 
	 * 데이터를 담당하는 .틀.을 Value Object(VO) = Data Transfer Object(DTO)라고 한다. 
	 * 이 클래스의 이름은 StudentVO class가 되어야한다.
	 * 
	 * coding할때 외부가 알아야 하는 메소드가 아니라면 private를 사용한다
	 * StudentVO의 경우는 외부에서 이용해야하므로 public사용.
	 * 
	 * 
	 * 필요한 메소드만 외부에 공개하고 모든접근제한자를 private로 넣고
	 * 메소들로만 관리가 가능하게 하는것을 캡슐화라고 한다. 
	 * 
	 */
	
	private String name;
	private int kor, eng, math, id;
	//필드에 값을 넣는 메소드 >> setter
	//필드에 현재값을 받는 메소드 >> getter
	//값 자체를  returnValue로 갖는다
	public String getName() {
		return name;
	}

	public void setName(String name) {	//마우스 우클릭 source > generate getter&setter
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
	
	//public void set필드명(필드타입 필드이름){
	//	this.필드명 = 필드이름
	//}
	
	//parameter로 모든 클래스의 객체가 넘어올 수 있다. 
	//모든 클래스의 객체를 매개변수로 받는 메소드를 만드는 법
	//1. 모든 클래스를 전부 다 Overload 해준다. >> 사실상 불가
	//2. 다형성 이용  polymophsm  >>Object class >>모든 클래스의 조상클래스
	// 임의의 클래스 타입의 매개변수를 받는 메소드는 그 클래스의 모든 자손타입의 클래스를 매개변수로 받을 수 있다. 
	//
	
	
	@Override
	public String toString() {
		return  "id=" + id+ "name=" + name + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math;
	}

	public boolean equals(Object o){
		//2개의 객체를 비교할 때 같은지 알아보는 방법
		//같은 클래스의 객체인 경우 >> 해당 클래스 필드 중 특정 field 혹은 모든 field를 비교해서 모두다 같으면 두개가 같은 객체이다.
		//
		//두 객체가 같은 클래스의 객체인지 확인하는 방법
		//parameter o 가 null이 아니고 StudentVO 클래스의 객체인지 확인해본다.
		//instanceof 이용 o가 studentVO의 객체이면 true이다 
		
		if(o instanceof StudentVO){
		//Object o이기 때문에 StudentVO필드를 꺼내올 수 없어서 
		//명시적 형변환을 통해 studentVO객체에 덮어 씌울 수 있다.
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
