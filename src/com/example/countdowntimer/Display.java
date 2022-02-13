package com.example.countdowntimer;

public class Display {

    public void display(int min, int sec) {

        String output = String.format("%02d:%02d", min, sec);

        System.out.println(output);
    }

    public void displayEnd() {
        {
            System.out.println("Time's up bitch!");
        }
    }

}
