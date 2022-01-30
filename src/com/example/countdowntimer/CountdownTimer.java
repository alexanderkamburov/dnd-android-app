package com.example.countdowntimer;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int duration = 90; // seconds; when having user input, make sure it's > 0

            public void run() {
                int minutes = 0; // it's 0, in case duration is <60

                // break down seconds into minutes if duration more than 60
                if (duration >= 60) {
                    minutes = (int) Math.floor(duration / 60); // Math.floor(this number) = 'round this number down'
                }

                int seconds = (duration - minutes * 60);

                // create variable 'output' which we will put out to the screen.
                // format it so that we have leading zeroes when minutes/seconds are in single digits
                // i.e. 1 minute 1 second is not 1:1, but 01:01
                String output = String.format("%02d:%02d", minutes, seconds);

                System.out.println(output);
                duration--; // duration = duration - 1;


                if (duration < 0) {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }
}
