package com.example.countdowntimer;

public class Counter {
    public void main(int userTimeSeconds, DisplayToConsole display) throws InterruptedException {
        int SixtyIn = 60;

        for (int time = userTimeSeconds; time >= 0; time--) {
            int timeM = 0;

            if (time >= SixtyIn) {
                timeM = (time / SixtyIn);
            }

            int timeS = (time - timeM * SixtyIn);

            display.doDisplayTime(timeM, timeS);

            if (time == 0) {
                display.doDisplayTimerEnd();
            }

            Thread.sleep(1000);
        }
    }
}
