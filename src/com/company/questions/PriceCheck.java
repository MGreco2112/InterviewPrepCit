package com.company.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceCheck {
    public static final String[] PRODUCTS = {"eggs", "milk", "cheese"};
    public static final float[] PRODUCT_PRICES = {2.89f, 3.29f, 5.79f};

    public static void main(String[] args) {
        List<String> productsSold = Arrays.asList("eggs", "eggs", "cheese", "milk");
        List<Float> soldPrice = Arrays.asList(2.89f, 2.99f, 5.97f, 3.29f);

        int errors = 0;

        for (int i = 0; i < productsSold.size(); i++) {
            int productIndex = Arrays.asList(PRODUCTS).indexOf(productsSold.get(i));

            if (!soldPrice.get(i).equals(PRODUCT_PRICES[productIndex])) {
                errors++;
            }
        }

        System.out.println(errors);
    }
}
