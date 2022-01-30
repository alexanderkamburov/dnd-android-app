package com.example.countdowntimer;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int counter = 234; // seconds; when having user input, make sure it's > 0

            public void run() {
                int minutes = 0;

                if ((counter / 60) >= 1) {
                    minutes = (int) Math.floor(counter / 60);
                }

                int seconds = (counter - minutes * 60);
                String output = String.format("%02d:%02d", minutes, seconds);

                System.out.println(output);
                counter--;

                if (counter == 0) {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
//        }, 0, 1000);
        }, 0, 10);
    }
}
