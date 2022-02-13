package com.example.countdowntimer;

public class Counter {

 public void count(int c , Display displays)  throws InterruptedException {

        int SixtyIn = 60;

        for (int time = c; time >= 0; time--) {

            int timeM = 0;

            if (time >= SixtyIn) {
                timeM = (time / SixtyIn);
            }

            int timeS = (time - timeM * SixtyIn);

            displays.display(timeM,timeS);

            if (time == 0) {

                displays.displayEnd();

            }

            Thread.sleep(1000);

        }

    }

}









