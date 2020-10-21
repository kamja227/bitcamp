package com.bit.day11;

class Lec12 {

    Lec12(int a) { //생성자
        System.out.println("create Lec12 obj...");
    }

    void func01() {
        System.out.println("Lec12 func01 call...");
    }
}

public class Ex12 extends Lec12 {
    Ex12() {
        super(1234); //부모의 생성자 호출
        System.out.println("create Ex12");
    }
    Ex12(int a) {
        super(a);
    }
    Ex12(String a) {
        super(122);
        //this(); //this와 super공존할 수 없음
    }

    public static void main(String[] args) {

        Ex12 me=new Ex12();
        me.func01();

    }
}