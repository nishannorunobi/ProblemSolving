package com.company.exam.sbl;

import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]){
        String inputData = "1.0.a.1.0.1.0";
        Scanner scanner = new Scanner(inputData);
        while (scanner.hasNext()){
            int output = scanner.nextInt();
            System.out.println(output);
        }
    }
}


// Ans : Runtime error