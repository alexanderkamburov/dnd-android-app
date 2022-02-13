package com.example.countdowntimer;

public class CountdownTimer {

    public static void main(String[] args) throws InterruptedException {
        Display displayingTimer = new Display();

        Counter counter = new Counter();
        counter.count(5, displayingTimer);
    }

}

