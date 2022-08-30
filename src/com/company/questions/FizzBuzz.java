package com.company.questions;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            boolean threeMod = i % 3 == 0;
            boolean fiveMod = i % 5 == 0;

            if (threeMod && fiveMod) {
                System.out.println("FizzBuzz");
            } else if (threeMod) {
                System.out.println("Fizz");
            } else if (fiveMod) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
