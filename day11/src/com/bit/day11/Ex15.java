package com.bit.day11;

class Lec15 {
    public void func01() {
        System.out.println("Lec15 func01");
    }
}

public class Ex15 extends Lec15 {
    public void func01() {
        System.out.println("Ex15 func01");
    }
    public void func02() {
        System.out.println("Ex15 func02");
    }
    public static void main(String[] args) {
        // 다형성

        Lec15 me=new Ex15(); //Ex15 me=new Ex15();
        me.func01();
        //me.func02(); //Ex15 me=new Ex15();일때는 가능
        Ex15 you=(Ex15)me;
        Lec15 me2=you;
        you.func02();
        System.out.println("-----------------------------");

    
        // Integer su=new Integer(1234);
        // Double su=new Double(3.14);
        // Integer su=1234;
        // Double su=3.14;          //auto boxing

        Number su=new Double(3.14);
        System.out.println("su="+su);
        func03(3.14);
    }
    public static void func03(Object a) {  //double안됨 wrapperdouble가능
        System.out.println(a);
        }
}