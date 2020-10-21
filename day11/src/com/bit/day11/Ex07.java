package com.bit.day11;

class Lec09 {
    int su=1234;

    void func01() {
        System.out.println("Lec09 func01...");
    }
}
public class Ex07 extends Lec09 {
    public static void main(String[] args) {
    //  Lec09 you=new Lec09();
    //  you.func01();
        Ex07 me=new Ex07();
        me.func01();

    }
    
}

//상속