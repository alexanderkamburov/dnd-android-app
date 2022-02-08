package com.example.countdowntimer;

public class DisplayToConsole {
    public void doDisplayTime(int minutes, int seconds) {
        String output = String.format("%02d:%02d", minutes, seconds);

        System.out.println(output);
    }

    public void doDisplayTimerEnd() {
        System.out.println("Time's up bitch!");
    }
}
