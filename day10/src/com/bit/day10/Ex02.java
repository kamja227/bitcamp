package com.bit.day10;

public class Ex02 {
    int su;

    public Ex02() {
        //su=1234;대신
        this(1234); //생성자에서만. 원래this와 다름
        System.out.println(this); //com.bit.day10.Ex02@15db9742

    }

    public Ex02(int su) { //객체생성
        System.out.println("객체가 생성되었습니다");
        this.su=su;
    }

    public static void main(String[] args) {
        Ex02 me = new Ex02();
        //Ex02 me = new Ex02(4321);
        System.out.println(me);
        Ex02 you = new Ex02();
        System.out.println(you);
        System.out.println("su=" + me.su);

    }
    //객체가 생성되었습니다 나오는
}