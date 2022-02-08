package com.example.countdowntimer;

public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        DisplayToConsole timerDisplay = new DisplayToConsole();

        Counter counter = new Counter();
        counter.main(3, timerDisplay);
    }
}

