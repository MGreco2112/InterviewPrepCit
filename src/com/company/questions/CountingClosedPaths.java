package com.company.questions;

import java.util.Scanner;

public class CountingClosedPaths {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int output = 0;
        int input = scanner.nextInt();

        String parsedInput = Integer.toString(input);

        for (int i = 0; i < parsedInput.length(); i++) {
            //0,6,4,9  8
            switch (parsedInput.charAt(i)) {
                case '0':
                case '4':
                case '6':
                case '9':
                    output++;
                    break;
                case '8':
                    output += 2;
                    break;
            }
        }

        System.out.println(output);

    }
}
