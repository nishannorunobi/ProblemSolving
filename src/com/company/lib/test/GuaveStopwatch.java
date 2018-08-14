package com.company.lib.test;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class GuaveStopwatch {
    public static void main(String args[]) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        Thread.sleep(30000);
        stopwatch.stop();
        long value = stopwatch.elapsedTime(TimeUnit.MICROSECONDS);
        System.out.println(value);

    }
}
