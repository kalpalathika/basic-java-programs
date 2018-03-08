package com.kalpu;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("model is \t" +porsche.getModel());
    }
}