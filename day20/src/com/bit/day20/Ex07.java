package com.bit.day20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// Map
		java.util.Map map1 = new java.util.HashMap();
		// key�� �ߺ��� �Ұ���
		// value�� �ߺ��� ����
		int[] arr = {1,2,3,4,5};
		
		map1.put("key1", "val1");
		map1.put("key2", "val2");
		map1.put("key3", "val3");
		map1.put("key4", "val4");
		map1.put("key5", Arrays.toString(arr));

		map1.put("key1", "abcd");
		map1.put(1234, "ABCD");
		map1.put(true, "ABCDabcd");
		map1.put(null, "1234");
//		System.out.println(Arrays.toString(arr));
		System.out.println(map1.get("key5") + "dd");
		System.out.println(map1.get("key4")); // ���
		System.out.println(map1.get("key1")); // key�� �ߺ� �Ұ���
		
		System.out.println(map1.get("key100")); // ���� key �����ص� exception ���� ���� null
		
		System.out.println(map1.get(true)); // ����
		System.out.println(map1.get(null)); // ����
		

	}
}
