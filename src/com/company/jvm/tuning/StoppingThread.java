package com.company.jvm.tuning;

import java.util.Scanner;

public class StoppingThread implements Runnable{
    @Override
    public void run() {
        while (Util.flag){
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            Util.flag = false;
            System.out.println(Util.flag);
        }
    }
}
