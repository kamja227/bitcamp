package com.bit.day11;

class Lec13 { //final class Lec13 = �긽�냽嫄곕�
    public void func01() {
        System.out.println("Lec13 func01...");
    }
    private void func02() {
        System.out.println("private func01...");
    }
}
public class Ex13 extends Lec13{
    
    public void func01() {
        System.out.println("Ex13 func01...");
    }
    void func02() {
        System.out.println("Ex13 func01...");
    }
    public static void main(String[] args) {
        Ex13 me=new Ex13();
        me.func01();
        me.func02();

    }
    
}

//�젒洹쇱��젙�옄 public>default>private 
//�뿴�뼱媛�嫄곕굹 媛숈쑝硫� �삤踰꾨씪�씠�뱶 媛��뒫
//遺�紐④� private硫� �떎媛��뒫
//�뿴由щ뒗 諛⑺뼢�쑝濡� 媛��뒫 