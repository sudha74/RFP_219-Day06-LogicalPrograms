package com.bridgelabz.logicalPrograms;

public class StopWatch {
    /*
    6. Simulate stopwatch program
        a. Desc -> Write a stopwatch program for measuring the time that elapses between the start and end clicks
        b. I/P -> Start the Stopwatch and End the Stopwatch
        c. Logic -> Measure the Elapsed time between start and end
        d. O/P -> Print the elapsed time
        */

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime, elapsedTime;

        startTime = System.currentTimeMillis();
        System.out.println("start time : " + startTime);

        Thread.sleep(3000);

        endTime = System.currentTimeMillis();
        System.out.println("end time : " + endTime);

        elapsedTime = endTime - startTime;
        System.out.println("elapsed time = " + elapsedTime);
    }
}
