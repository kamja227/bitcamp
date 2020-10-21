package com.bit.day11;

class Father {
    int money=1000;
    void work() { 
        this.money+=100;
        System.out.println("돈벌어온다"); 
    }
    void push() { money-=10; }
}
class Son extends Father {
    //메서드 오버라이드
    int money=0;
    void work() {
        money+=10;
        System.out.println("용돈을 받는다");
    } //부모의 기능을 자식걸로 덮어쓴다
    
}

public class Ex08 {
    public static void main(String[] args) {
        Father fa=new Father();
        // System.out.println(fa.money);
        // fa.work();
        // fa.work();
        // fa.work();
        // System.out.println(fa.money);
        
        Son son=new Son();
        System.out.println(son.money);
        son.work();
        System.out.println(son.money);


        System.out.println("---------------------------");
        Object obj=new Object();
        System.out.println(obj.toString()); //참조변수 toString 자동생성..?
        System.out.println(obj.hashCode());
        System.out.println("---------------------------");
        Ex08 me=new Ex08();
        System.out.println(me.toString());
        System.out.println(me.hashCode());
     
    }
    public String toString() {
        return "나 자신"; 
    }
}