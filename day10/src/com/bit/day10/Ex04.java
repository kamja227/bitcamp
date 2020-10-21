package com.bit.day10;

public class Ex04 {
    static String msg2;


    public static void main(String[] args) {
        String msg1;
        msg1="문자열";
        String msg3="";
        String msg4=new String(); //객체가 찍혀서 null 아님
        char[] ch={'문','자','열'};
        String msg5=new String(ch);
        String msg6=new String("문자열");
        String msg7="문자열";
        String msg8="문자";
        String msg9=msg8+"열";
        String msg10="문자"+"열";

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        System.out.println(msg5);
        System.out.println(msg6);
        System.out.println(msg1==msg7); 
        System.out.println(msg6==msg7); //참조변수, 주소값비교 (msg가 새로운 객체를 찍어내고 있음)
        System.out.println(msg7==msg10); //특수한 경우

    
        byte[] by={65,66,67,68};
        String msg11=new String(by);
        System.out.println(msg11);
        System.out.println();

        byte[] by2=new byte[128];
        for(int i=0; i<by2.length; i++) {
            by2[i]=(byte)i;
        }
        String msg12=new String(by2);
        System.out.print(msg12);

    }
}