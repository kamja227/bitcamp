package com.bit.day10;

public class Lotto01 {
    public static void main(String[] args) {
        //로또번호?��?���?
        //1~45까�? ?��?�� 6�?
        //?��?��, 중복불�?
        //출력?? ?��름차?�� ?��?��
        //보너?��번호
        int[] su = new int[45];
        su[0]=(int)(Math.random()*su.length)+1;

        for(int i=1; i<su.length; i++) {
            su[i]=(int)(Math.random()*su.length)+1;
            
            for(int j=0; j<i; j++) {
                while(su[j]==su[i]) {   
                    su[i]=(int)(Math.random()*su.length)+1; 
                    j=0;    //su[j]?? su[i]�? 같았?���? j�? 0�??�� ?��?�� 비교
                }
            }
        }

        int[] rotto = new int[6]; //rotto배열 ?��?��
        int bonus = su[rotto.length];  //bonus 번호?�� su[6],su[5]까�? rotto배열?�� 복사?���? ?���?

        for(int i=0; i<rotto.length; i++) { //rotto배열?�� su배열?�� 6번까�? ???��
            rotto[i] = su[i];
        }

        int temp=0; 
        for(int i=0; i<rotto.length; i++) {
            for(int j=1; j<rotto.length; j++) {
               if(rotto[j]<rotto[j-1]) {
                   temp=rotto[j-1];
                   rotto[j-1]=rotto[j];
                   rotto[j]=temp;
               } 
            }
        }
        
        for(int i=0; i<rotto.length; i++) {
            System.out.print(rotto[i] + " ");
        }
        System.out.println("+" + bonus); 

        
    } //main end
} //class end