package ru.netology.pyas;

public class Box {

    private volatile boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Коробка: тумблер включён");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Коробка: тумблер выключён");
    }

    public void run() {
        while(true) {
            if (Thread.currentThread().isInterrupted()){
                return;
            }
            if (isOn) {
                System.out.println("Коробка: выключает тумблер");
                turnOff();
            }
        }
    }
}
