package com.bit.day11;

import com.bit.day10.Ex20;

public class Ex14 extends Ex20{
    //public > protected >= default > private
    //protected 
    //- default와 일반적으로 동일
    //- 단 상속을 통한 접근은 다른 패키지 일지라도 접근 허용
    
    public static void main(String[] args) {
     
    	Ex14 me = new Ex14();
        me.func01();
    
    }
}