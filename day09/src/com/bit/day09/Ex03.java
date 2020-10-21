package com.bit.day09;

public class Ex03 {
     //default 생성자는 접근제한자가 public
     final int su;
     final static int su2=333;
     
    Ex03(int a) {
        //객체는 생성됐음
        //객체생성시점에 하고 싶은 일 
        //해당 생성자의 호출 객체 생성시 
        //단 한번만 이루어짐
        ////////////////////////////////////
        //필드 초기화(int su;)
        su=a;

    }

    public static void main(String[] args) {
        //상수형 변수
        //이름 대문자로만
        final int a=1111;  //변수의 초기화
        //a=2222;  //변수 대입

        final double PI = 3.14;

        Ex03 me = new Ex03(1111);
     
        //me.su++;
        //you.su++;
        System.out.println(me.su);
        //System.out.println(you.su);
    }
}