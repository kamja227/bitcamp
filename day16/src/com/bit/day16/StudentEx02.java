package com.bit.day16;

import java.util.ArrayList;

/*
 Collection Framework에는 같은 종류의 여러 객체를 한번에 다룰 수 있게 해주는 다양한 클래스 존재
 그 중 하나가 ArrayList

 */

public class StudentEx02 {

	public static void main(String[] args) {
		
		ArrayList<StudentVO> list = new ArrayList<>();
		
		//< >템플릿에는 list의 type이 들어간다. 
		//StudentVO class type을 element로 가진 list
		//StudentVO()객체를 만들면 add()로 arrayList<StudentVO> list에 저장된다. 
		
		// < > : template
		// 해당 콜렉션 객체가 무슨 클래스의 집합인지 지정한다. 템플릿에는 클래스만 들어갈 수 있다.
		// collerction framework는 주소값을 이용해 집합 내 요소들을 컨트롤하므로 주소값이 없는 기본형데이터는 들어갈
		// 수 없다.
		// 따라서 기본형은 wrapper class를 이용함.
		// collection Framework는 equals() 메소드를 내부에서 적극사용한다.
		// collection Framework에 들어있는 클래스를 활용하기 위해서는 사용자가 만든 클래스에
		// equals()메소드를 오버라이딩 하는 것이 매우 중요하다.
		// java.lang.Object의 equals()메소드는
		// Parameters:c - the collection whose elements are to be placed into
		// this list

		// arraylist는 크기가 자동으로 변함. 현재크기는 size()메소드 이용.

		
		System.out.println("List의 현재크기 : " + list.size());
		StudentVO s = new StudentVO();
		s.setName("형진");
		s.setKor(88);
		s.setEng(64);
		s.setMath(54);

		StudentVO s2 = new StudentVO();
		s2.setName("형진2");
		s2.setKor(88);
		s2.setEng(64);
		s2.setMath(54);
		
		StudentVO s3 = new StudentVO();
		s3.setName("형진3");
		s3.setKor(88);
		s3.setEng(64);
		s3.setMath(54);
		
		StudentVO s4 = new StudentVO();
		s4.setName("형진4");
		s4.setKor(88);
		s4.setEng(64);
		s4.setMath(54);
		
		StudentVO s5 = new StudentVO();
		s5.setName("형진5");
		s5.setKor(88);
		s5.setEng(64);
		s5.setMath(54);
		
		list.add(s);
		System.out.println("List의 현재크기 : " + list.size());
		list.add(s2);
		System.out.println("List의 현재크기 : " + list.size());
		list.add(s3);
		System.out.println("List의 현재크기 : " + list.size());
		list.add(s4);
		System.out.println("List의 현재크기 : " + list.size());
		list.add(s5);
		System.out.println("List의 현재크기 : " + list.size());
		
/*		특정위치에 끼워넣을 경우
		원래 그 번호에 있던 객체는 하나씩 뒤로 밀린다. 
		그 위치에 매개변수로 넘긴 객체가 들어간다. 
		add(index, element)*/
		
		StudentVO s6 = new StudentVO();
		s6.setName("형진6");
		s6.setKor(88);
		s6.setEng(64);
		s6.setMath(54);

		System.out.println("index 2의 studentVO의 getName" + list.get(2).getName());
		//studentVO객체들을 가진 list에서 2번째 객체가 가지고 있는 Name변수 호출
		System.out.println("list.add(2, s6);");
		list.add(2, s6);
		System.out.println("index 2의 studentVO의 getName" + list.get(2).getName());
		System.out.println("List의 현재크기 : " + list.size());
		
			//list에서 해당객체의 index를 보는 법
		System.out.println("s5의 list Index : "+list.indexOf(s5));
		System.out.println("s4의 list Index : "+list.indexOf(s4));

		System.out.println("s3의 list Index : "+list.indexOf(s3));
		System.out.println("s6의 list Index : "+list.indexOf(s6));
		System.out.println("s2의 list Index : "+list.indexOf(s2));
		System.out.println("s1의 list Index : "+list.indexOf(s));
		
	//	해당 객체에 동일객체가 여러개 있으면 제일 앞에 있는 객체의 index를 리턴한다. 
		list.add(s3);
		list.add(s3);
		list.add(s3);
		System.out.println("s3의 list Index : "+list.indexOf(s3)); //제일 앞의 s3의 인덱스가 출력. 
		System.out.println("List의 현재크기 : " + list.size());
		
		//제일 마지막  객체의 index
		System.out.println("s3의 list lastindex : "+list.lastIndexOf(s3));
		
		//list에 찾는 객체가 존재하는지 안하는지 확인 하는 방법 contains() true of false
		System.out.println("list에 s2가 존재하는가 : " + list.contains(s2));
		
		//indexOf. lastIndexOf. contains. 존재하지 않는 객체를 요구하면 
		// -1    	-1			 false      << returnValue
		
		
/*		list에서 삭제할 때
		1. 해당 인덱스 삭제
		2. 해당 객체와 일치하는 elements 중에서 가장 앞번호 삭제 

*/
		System.out.println("List의 현재크기 : " + list.size());
		list.remove(0);		//index 0번 삭제 
		System.out.println("list에 s가 존재하는가 : " + list.contains(s));
		System.out.println("List의 현재크기 : " + list.size());
		list.remove(s3);  //Removes the first occurrence of the specified element from this list,if it is present. 
						//해당 객체가 없으면 false리턴 있으면 true
		System.out.println("List의 현재크기 : " + list.size());
		
		StudentVO s60 = new StudentVO();
		s60.setName("형진6");
		s60.setKor(88);
		s60.setEng(64);
		s60.setMath(54);
		//list.remove(s60) >> parameter가 가르키는 data가 list에 존재하면 true를 리턴, 아닐 경우 false
		if(list.remove(s60)){ //s60이지만 s6과 같은 내용이므로 true가 리턴되어 if문이 수행됨.
			System.out.println("remove(s60) >> s6이 대신 삭제됨");
		}
		//remove >> (s==null ? get(i)==null : s.equals(get(i)))
		System.out.println("list에 s6이 존재하는가 : " + list.contains(s6)); //false list가 없으므로.
		System.out.println("s6의 list Index : "+list.indexOf(s6)); // -1 
		
		//내부적으로 equals()메서드로 비교하므로 s60과 s6 내용이 같기때문에 remove(s60)으로 s6이 리스트에서 삭제됨.
		
	}
}
