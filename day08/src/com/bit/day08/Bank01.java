package com.bit.day08;

class Bank{
	int money;

	public void add(int a) {
		money+=a;
	}
	public void minus(int a) {
		money-=a;
	}
	public void print() {
		System.out.println("잔금:"+money+"원");
	}
}


class Bank01 {
	public static void main(String[] args) {
		
		Bank hana=new Bank();
		hana.add(1000);
		hana.minus(200);
		hana.minus(250);
		Bank woori=new Bank();
		woori.add(10000);	
		hana.minus(300);
		System.out.println("하나은행에서 ");
		hana.print();
		System.out.println("우리은행에서 ");
		woori.print();

		/*
		Bank cd=new Bank();
		cd.add(1000);
		cd.print();
		cd.minus(500);
		cd.print();
		cd.minus(300);
		cd.add(2000);
		cd.print();
		*/
	}
} //class end