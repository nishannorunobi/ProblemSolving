package com.company.ksl.y2018.feb.fourthweek;

//https://vjudge.net/contest/214014#problem/B

import java.util.Scanner;

public class Tue2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int noOfBooks = scanner.nextInt();
            int maxTime = scanner.nextInt();
            int partition[] = new int[noOfBooks];
            for (int i = 0; i < noOfBooks; i++) {
                partition[i] = scanner.nextInt();
            }

            int max = 0;
            int k = 0;
            int sum = 0;
            int count = 0;
            for (int j = 0; j < noOfBooks; j++) {
                while (k < noOfBooks) {
                    int time = partition[k];
                    if ((sum + time) <= maxTime) {
                        sum += time;
                        count++;
                    } else {
                        break;
                    }
                    k++;
                }
                if (count > max) {
                    max = count;
                }
                if ((k + 1) >= noOfBooks) {
                    break;
                }

                sum -= partition[j];
                count--;
            }
            System.out.println(max);
        }
    }
}
