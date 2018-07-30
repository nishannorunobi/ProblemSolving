package com.company.jvm.tuning;

public class MemoryMonitorThread extends Thread{
    @Override
    public void run() {
        while (Util.flag){
            try {
                super.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
