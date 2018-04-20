package com.company.exam.sbl;

import java.util.Scanner;

public class Problem1_sol {
    public static void main(String args[]){
        String inputData = "1101011112";
        Scanner scanner = new Scanner(inputData);
        while (scanner.hasNext()){
            int output = scanner.nextInt();
            System.out.println(output);
        }
    }
}
