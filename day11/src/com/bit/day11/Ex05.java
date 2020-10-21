package com.bit.day11;

public class Ex05 {
    public static void main(String[] args) {
        char ch1='A';
        Character ch2=new Character(ch1); //문자열 안됨
        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);


        //유니코드문자인지
        System.out.println("유니코드인지:" +Character.isDefined(ch2));
        System.out.println("숫자인가?" +Character.isDigit(ch2));
        //if '0' <= ch2 <=9
        System.out.println("문자인가?" +Character.isAlphabetic(ch2)); //알파벳이 아니라 문자
        System.out.println("문자인가?" +Character.isLetter(ch2)); //위아래 같음
        
        //대소구분
        System.out.println("대문자인가?"+Character.isUpperCase(ch2));
        System.out.println("소문자인가?"+Character.isLowerCase(ch2));

        //띄어쓰기
        System.out.println("띄어쓰기"+Character.isSpace(ch2)); //메이저버전 업 한적이 없어서 쓸 수 있음
        System.out.println(Character.isWhitespace(ch2));

        


    }
}