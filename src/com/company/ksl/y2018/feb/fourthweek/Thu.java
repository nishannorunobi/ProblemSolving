package com.company.ksl.y2018.feb.fourthweek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Thu {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            Queue<Integer> arr = new LinkedList<>();
            int input = scanner.nextInt();
            if (input == 1 || input == 2) {
                arr.add(-1);
            } else {
                arr.add(2);
                arr.add(3);
                arr.add(1);
                int i = 3;
                while (i < input) {
                    arr.add(i);
                    i++;
                }
            }
            if (!arr.isEmpty()) {
                System.out.print(arr.poll());
            }
            while (!arr.isEmpty()) {
                System.out.print(" " + arr.poll());
            }
            System.out.println();
        }

    }
}
