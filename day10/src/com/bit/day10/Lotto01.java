package com.bit.day10;

public class Lotto01 {
    public static void main(String[] args) {
        //ë¡œë˜ë²ˆí˜¸?ƒ?„±ê¸?
        //1~45ê¹Œì? ?ˆ«? 6ê°?
        //?œ?¤, ì¤‘ë³µë¶ˆê?
        //ì¶œë ¥?? ?˜¤ë¦„ì°¨?ˆœ ? •? ¬
        //ë³´ë„ˆ?Š¤ë²ˆí˜¸
        int[] su = new int[45];
        su[0]=(int)(Math.random()*su.length)+1;

        for(int i=1; i<su.length; i++) {
            su[i]=(int)(Math.random()*su.length)+1;
            
            for(int j=0; j<i; j++) {
                while(su[j]==su[i]) {   
                    su[i]=(int)(Math.random()*su.length)+1; 
                    j=0;    //su[j]?? su[i]ê°? ê°™ì•˜?œ¼ë©? jê°? 0ë¶??„° ?‹¤?‹œ ë¹„êµ
                }
            }
        }

        int[] rotto = new int[6]; //rottoë°°ì—´ ?ƒ?„±
        int bonus = su[rotto.length];  //bonus ë²ˆí˜¸?Š” su[6],su[5]ê¹Œì? rottoë°°ì—´?— ë³µì‚¬?•˜ê¸? ?•Œë¬?

        for(int i=0; i<rotto.length; i++) { //rottoë°°ì—´?— suë°°ì—´?˜ 6ë²ˆê¹Œì§? ???…
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