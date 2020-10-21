package com.bit.day10;

public class Lotto02 {
    public static void main(String[] args) {
        //ë¡œë˜ë²ˆí˜¸?ƒ?„±ê¸?
        //1~45ê¹Œì? ?ˆ«? 6ê°?
        //?œ?¤, ì¤‘ë³µë¶ˆê?
        //ì¶œë ¥?? ?˜¤ë¦„ì°¨?ˆœ ? •? ¬
        //ë³´ë„ˆ?Š¤ë²ˆí˜¸
        int[] lotto=new int[7];     //6+ bonus1
        //ì¤‘ë³µê²??‚¬ ?›„ ?…? ¥
        //ì¤‘ë³µ?‹œ ?¬?…? ¥
        for(int i=0; i<lotto.length; i++) {
            
            int ran=(int)(Math.random()*45)+1;
            lotto[i]=ran;
            
            for(int j=0; j<=i-1; j++) {     //i=0?´ë©? j=-1?´?¼?„œ ?‹¤?–‰?˜ì§? ?•Š?Œ
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