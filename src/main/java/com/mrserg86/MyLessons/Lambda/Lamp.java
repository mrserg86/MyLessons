package com.mrserg86.MyLessons.Lambda;

public class Lamp implements ElectricityConsumer{

    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
