package com.bit.day10;

public class Lotto02 {
    public static void main(String[] args) {
        //로또번호?��?���?
        //1~45까�? ?��?�� 6�?
        //?��?��, 중복불�?
        //출력?? ?��름차?�� ?��?��
        //보너?��번호
        int[] lotto=new int[7];     //6+ bonus1
        //중복�??�� ?�� ?��?��
        //중복?�� ?��?��?��
        for(int i=0; i<lotto.length; i++) {
            
            int ran=(int)(Math.random()*45)+1;
            lotto[i]=ran;
            
            for(int j=0; j<=i-1; j++) {     //i=0?���? j=-1?��?��?�� ?��?��?���? ?��?��
                if(lotto[i]==lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        int temp=0;
        for(int i=0; i<5; i++) {
            for(int j=i+1; j<6; j++) {
                if(lotto[i]>lotto[j]) {
                    temp=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=temp;
                }
            }
        }
        for(int i=0; i<5; i++) {
            System.out.print(lotto[i]+" ");
        }
        System.out.println("+"+lotto[5]);
        
    } //main end
} //class end