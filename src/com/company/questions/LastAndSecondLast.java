package com.company.questions;

public class LastAndSecondLast {
    public static String solution(String input) {

        return input.charAt(input.length() - 1) + " " + input.charAt(input.length() - 2);
    }
}
