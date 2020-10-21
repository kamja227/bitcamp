package com.bit.day09;

public class Ex07 {
    public static void main(String[] args) {
        //1~6까지 랜덤한 수로 배열 만들기
        //중복없음
        int[] su = new int[6];
        su[0]=(int)(Math.random()*su.length)+1;

        for(int i=1; i<su.length; i++) {
            su[i]=(int)(Math.random()*su.length)+1;
            
            for(int j=0; j<i; j++) {
                while(su[j]==su[i]) {
                    su[i]=(int)(Math.random()*su.length)+1;
                    j=0;
                }
            }
        }
        for(int i=0; i<su.length; i++) {
            System.out.print(su[i] + " ");
        }

    } //main end
} //class end