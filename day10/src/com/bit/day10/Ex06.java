package com.bit.day10;

public class Ex06 {
    public static void main(String[] args) {
        int su = 1234; // 기본자료형 객체아님

        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 1, 3, 5, 7, 9 }; // 객체생성함, int[] arr2=new int[]{1,3,5}과 같음 new생략
        int[] arr3 = new int[] { 1, 3, 5, 7, 9 };
        int[] arr4 = arr3; // 배열의 옅은복사

        arr4[2] = 10;
        // System.out.println(arr1; //정보@해시코드

        System.out.println(arr1.toString()); // 정보@해시코드
        System.out.println(arr1 == arr2); // 두 객체가 다름 false

        func01(arr4);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }

    public static void func01(int[] su) {
        su[3]=1234;
    }
}