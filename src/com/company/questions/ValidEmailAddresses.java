package com.company.questions;

import java.util.Arrays;
import java.util.List;

public class ValidEmailAddresses {
    public static List<String> addresses = Arrays.asList(
            "julia@hackerrank.com",
            "julia_@hackerrank.com",
            "julia_0@hackerrank.com",
            "julia0_@hackerrank.com",
            "julia@gmail.com"
        );

    public static void main(String[] args) {
        for (String address : addresses) {
            System.out.println(address.matches("[a-z]{1,6}_[0-9]{0,4}?(.*)@hackerrank.com"));
        }
    }
}
