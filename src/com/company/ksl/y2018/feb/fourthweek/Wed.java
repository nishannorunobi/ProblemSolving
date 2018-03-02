package com.company.ksl.y2018.feb.fourthweek;

//https://vjudge.net/contest/214014#problem/C

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Wed {
    //public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char arr[] = line.toCharArray();
            ArrayDeque<Character> regularString = new ArrayDeque<>();
            Stack<Character> segment = new Stack<>();
            boolean homeIndex = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '[') {
                    homeIndex = true;
                    addPrefix(segment, regularString);
                    continue;
                }
                if (arr[i] == ']') {
                    homeIndex = false;
                    addPrefix(segment, regularString);
                    continue;
                }
                if (homeIndex) {
                    segment.push(arr[i]);
                } else {
                    regularString.addLast(arr[i]);
                }
            }
            addPrefix(segment, regularString);
            StringBuilder output = new StringBuilder();
            while (!regularString.isEmpty()){
                output.append(regularString.pollFirst());
            }
            System.out.println(output.toString());
        }
    }

    private static void addPrefix(Stack<Character> segment, ArrayDeque<Character> regularString) {
        while (!segment.isEmpty())
            regularString.addFirst(segment.pop());
    }
}
