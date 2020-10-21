package com.bit.day11;

public class Ex01 {
    public static void main(String[] args){
        //래퍼클래스 (오토박싱&언박싱) -래핑,언래핑
        //기본자료형에 해당하는 클래스
        //int -> Integer
        int su1;
        su1=100;
        Integer su2;
        su2=new Integer(1000); //디폴트 생성자 존재x
        Integer su3=new Integer("2000"); //숫자만

        //autoboxing 오토박싱 자동 객체화
        Integer su4=1234;


        System.out.println(su2+su3);  
        //언박싱을 통해 int타입으로
        //이후 연산 수행
        //따라서 결과는 int타입

        System.out.println("int min val:"+Integer.MIN_VALUE); //int최소값
        System.out.println("int max val:"+Integer.MAX_VALUE); //int최대값
        System.out.println("int size:"+Integer.SIZE);
        System.out.println("int byte:"+Integer.BYTES);
        
        Integer su5=new Integer(128); 

        byte by=su5.byteValue();
        short sho=su5.shortValue();
        int su6=su5.intValue();
        long lo=su5.intValue();
        
        System.out.println(su5.byteValue());       
        System.out.println(su5.shortValue());       
      //  System.out.println(su5.intValue());       
        System.out.println(su5.longValue()); 


        Integer su7=new Integer(100);
        Integer su8=new Integer(100);
        System.out.println(su7==su8);
        System.out.println(su7.equals(su8));
      
        System.out.println(100==su7);  
        
        String msg="1234";
        Integer su9=Integer.valueOf(msg);
        int su99=su9;
        //int su99=Integer.valueOf(msg);
        System.out.println(su9+1);
        int su10=Integer.parseInt(msg);
        System.out.println(su10+1);
 

        int su11=Integer.max(12,9);
        int su12=Integer.min(12,9);
        System.out.println(su11);
        System.out.println(su12);

        int su13=1;
        int su14=Integer.reverse(su13); //비트 단위를 뒤집음
        System.out.println(su13+"의 보수: "+su14);

        int su15=16;
        System.out.println("10진수: "+su15);
        System.out.println("2진수: "+Integer.toBinaryString(su15));
        System.out.println("8진수: 0"+Integer.toOctalString(su15));
        System.out.println("16진수: 0x"+Integer.toHexString(su15));

        int su16=8;
        int su17=10;
        Integer su19=11;
        int su18=Integer.compare(su16,su17); //앞에가 크면 1 같으면 0 작으면 -1
        int su20=su19.compareTo(su17);
        System.out.println(su18);
        System.out.println(su20);

    }

}