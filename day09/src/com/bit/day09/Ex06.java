package com.bit.day09;

public class Ex06 {
    public static void main(String[] args) {
        //다음에 배열에 값을 +2씩 하고 출력하라
        int[] su1={ 1,4,6,7,9 };
        
        for(int i=0; i<su1.length; i++) {
            su1[i] += 2;
            System.out.print(su1[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");


      
        //0~10중 홀수를 담는 배열을 생성하고 출력하시오
        int cnt=0;
        for(int i=0; i<11; i++) {
            if(i%2 != 0) { cnt++; }
        }

        int k=0;
        int[] su2=new int[cnt];
        for(int i=0; i<11; i++) {
            if(i%2 != 0) {
                su2[k++]=i;
            }
        }
        for(int i=0; i<su2.length; i++) {
            System.out.print(su2[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");



        //알파벳 대문자를 담는 배열을 만들고 출력하시오
        // char en='A';
        char[] alpha = new char['Z'-'A'+1];

        for(int i=0; i<alpha.length; i++) {
            // alpha[i] = en;
            // en++;  
            alpha[i] = (char)('A'+i);
        }


        for(int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");



        //다음을 오름차순 정렬로 출력하시오
        int[] su3={ 8,7,4,3,2,1,22,333,24,16,123,19 };
        int mi=0;

        for(int a=0; a<su3.length; a++) {

            for(int i=0; i<su3.length-1; i++) {
                
                if(su3[i]>su3[i+1]) {
                    mi=su3[i];
                    su3[i]=su3[i+1];
                    su3[i+1]=mi;
                 
                }
            }
        }
        for(int i=0; i<su3.length; i++) {
            System.out.print(su3[i] + " ");
        }
        
    } //main end
} //class end