package com.company.jvm.tuning;

public class Main {
    public static void main(String args[]){
        new Thread(new StoppingThread()).start();
        int count = 1;
        while (Util.flag){
            new Thread(new CustomThread(count)).start();
            count++;
            //CustomLogger.log("Thread count : "+count);
        }
        System.out.println(Util.flag);
    }
}
