package com.bit.day10;

public class Lotto03 {
    public static void main(String[] args) {
        
        int[] ball = new int[45];
        for(int i=0; i<45; i++) {
            ball[i]=i+1;
        }

        int temp=0;
        for(int i=0; i<1000000; i++) {
            temp=ball[0];
            int ran=(int)(Math.random()*44)+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }

        for(int i=0; i<6; i++) {
            System.out.print(ball[i]+" ");
        }
        System.out.println("+"+ball[6]);  
              
    } //main end
} //class end

