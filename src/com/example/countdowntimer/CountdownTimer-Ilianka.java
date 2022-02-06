package com.example.countdown;

public class Counter {

    public static void main(String[] args) throws InterruptedException {
        int time = 65;
        int SixtyIn = 60;

        for (time = time; time >= 0; time--) {

            int timeM = 0;

            if (time >= SixtyIn) {
                timeM = (time / SixtyIn);
            }

            int timeS = (time - timeM * SixtyIn);

            String output = String.format("%02d:%02d", timeM, timeS);

            System.out.println(output);
            Thread.sleep(1000);
        }

        if (time < 0) {
            System.out.println("Time's up bitch!");
        }
    }

}
