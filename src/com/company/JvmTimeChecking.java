package com.company;

public class JvmTimeChecking {
    public static void main(String args[]) throws InterruptedException {
        long millitime = System.currentTimeMillis();
        long nanotime = System.nanoTime();
        Thread.sleep(60000);

        System.out.println(System.currentTimeMillis()-millitime);
        System.out.println((System.nanoTime()-nanotime)/1000);
    }
}
