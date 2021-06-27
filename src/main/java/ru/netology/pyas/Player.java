package ru.netology.pyas;

public class Player {

    private static final int TIMEOUT = 1000;
    private static final int TURN_NUMBER = 6;

    private Box box;

    public Player(Box box) {
        this.box = box;
    }

    public void run() {
        for(int i = 0; i < TURN_NUMBER; ++i) {
            try {
                Thread.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println("Игрок: включает тумблер");
            box.turnOn();
        }
    }
}
