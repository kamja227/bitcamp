package com.bit.day16;

public class StudentArrayUtil {
	// StudentVO 동적할당 배열size관계없이 사용할수있게.

	private static StudentVO[] expand(StudentVO[] arr) { // 배열크기 늘려주는 로직
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

		arr = expand(arr); // arr배열 크기 하나늘리는 메소드
		arr[arr.length - 1] = s;

		return arr;
	}

	@Override
	// 마우스 우클릭 > source > override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	// 배열에서 해당객체가 몇번째 인덱스인지 알려주는 메소드
	// 객체 비교시에는 비교연산자(==)가 아니라 메소드를 통해 비교해야한다
	// 비교연산자는 값이 아니라 변수가 참조하고있는 주소를 비교한다.

	// 몇번째인덱스인지확인할때
	// 몇번째 인덱스인지 확인되면 인덱스번호 리턴.
	// 배열에 없는 인덱스를 요구하는 경우.
	// 배열에서 존재할 리 없는 -1를 리턴하게 만들어 주면 된다.

	public static int indexOf(StudentVO[] arr, StudentVO s) {
		
		for (int i = 0; i < arr.length; i++) {
			if (s.equals(arr[i])) {
				return i;
			}
		}
		return -1;	// 배열에 없는 인덱스를 요구하는 경우.
	}

	/*
	 * 배열에서 특정 객체를 제거하고 크기도 한칸 줄이려면 어떻게 해야하는가.
	 * 
	 * 해당 배열에 그 객체가 존재하는지 체크한다. 존재하지 않을 경우엔 배열을 다시 그대로 보내준다. 존재할 경우 2개의 배열을 만들어서
	 * 0번부터 그 번호까지 복사 그 번호부터 끝까지 복사 그리고 두개를 합치면 만들 수 있다.
	 * 
	 * 
	 * 기존배열을 새배열에 복사 기존배열을 크기하나작게 새로 만든다 새배열의 내용을 복사하되 indexOf가 같을 시엔 복사하지 않는다.
	 */

	/*
	 * 
	 * */

	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		
		//먼저 S가 arr에 존재하는지 확인
		if(indexOf(arr, s) != -1){
			//존재하므로 앞부분과 뒷부분으로 나누어 주자.
			int index = indexOf(arr, s);
			
			StudentVO[] temp = new StudentVO[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
				temp[i]=arr[i];							//기존 배열을 새 배열에 복사.
			}
			arr = new StudentVO[temp.length-1];			//기존 배열의 크기를 1개 줄여서 새로 만든다. 
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

