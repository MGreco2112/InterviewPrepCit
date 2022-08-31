package com.company;

import com.company.questions.FizzBuzz;
import com.company.questions.LastAndSecondLast;
import com.company.questions.cars.Car;
import com.company.questions.cars.HondaCity;
import com.company.questions.cars.InnovaCrysta;
import com.company.questions.cars.WagonR;

public class Main {

    public static void main(String[] args) {
//        System.out.println(LastAndSecondLast.solution("APPLE"));

        Car wagonR = new WagonR("25");
        Car hondaCity = new HondaCity("22");
        Car innovaCrysta = new InnovaCrysta("15");

        System.out.println(wagonR);
        System.out.println(hondaCity);
        System.out.println(innovaCrysta);
    }
}
