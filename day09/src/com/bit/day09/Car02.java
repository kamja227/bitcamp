package com.bit.day09;

class Car { 
    private String model;
    private int limit = 150;
    private int speed = 0;
    private int accel = 5;

    void speedUp() {
       if((speed+=accel) > limit) { speed=limit; };
    }
    void speedDown() {
        if((speed-=accel) < 0) { speed=0; };
    }
    void show() {
        System.out.println(model + "?��(�?) " + speed + "km�? ?��린다");
    }

    Car() {
        model="?��?���?";
        limit=150;
        accel=10;
    }
    
    Car(String name, int a, int b) {
        model=name;
        limit=a;
        accel=b;
    }

}

class Car02 {
    public static void main(String[] args) {
        Car car = new Car("모닝", 150, 5);
        car.show();

        for(int i=0; i<30; i++) {
           car.speedUp();
           car.show();
        }
        for(int i=0; i<30; i++) {
          car.speedDown();
          car.show();
        }

        car = new Car("???��?��", 180, 15);
        car.show();

        for(int i=0; i<30; i++) {
           car.speedUp();
           car.show();
        }
        for(int i=0; i<30; i++) {
          car.speedDown();
          car.show();
      
        }
    }
}
