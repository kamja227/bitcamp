package com.bit.day10;

class Car{
    private String model;
    private int speed;
    private int limit;
    private int accel;

    Car() {
        this("Ƽ��",100, 10);
    }


    
    Car(String model,int limit,int accel) {
        this.model=model;
        this.limit=limit;
        this.accel=accel;
    }
    void speedUp() {
        if((speed+=accel) > limit) {
            speed=limit;
        }
    }
    void speedDown() {
        if((speed-=accel) < 0) {
            speed=0;
        }
    }
    void show() {
        System.out.println(model+"��(��) "+speed+"km�� �޸���");
    }
}

public class Car03 {
    public static void main(String[] args) {
        Car car=new Car("���",120,15);
        // car.model="���";
        // car.accel=120;
        // car.accel=15;

        //car.model="��׾ƴ�"; //����, �����ڸ� private���� ����

        for(int i=0; i<15; i++) {
            car.speedUp();
            car.show();
        }
        for(int i=0; i<15; i++) {
            car.speedDown();
            car.show();
        }
    }
}