package com.company.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConnectedGroups {
    public static int solution(List<List<Integer>> input) {
        //This method creates an array with each index referencing one person
        //each index holds a number which says how many other people have a connection with that person

        //first attempt
//        int[] output = new int[input.size()];
//
//        for (int i = 0; i < input.size(); i++) {
//            for (int j = 0; j < input.size(); j++) {
//                if (input.get(i).get(j) == 1) {
//                    output[i]++;
//                }
//            }
//        }
//
//        List<Integer> formattedOutput = new ArrayList<>();
//
//        for (int connection : output) {
//            formattedOutput.add(connection);
//        }
//
//        return Collections.max(formattedOutput) - 1;

        //second attempt
        //goal: identify how many groups there are based on connections
        //create second matrix going down the rows for each person's relationships
        //compare indexes of new matrix to old matrix

        System.out.println("Input Matrix");

        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }

        List<List<Integer>> relationshipMatrix = new ArrayList<>();

        System.out.println("Relationship Matrix");

        int innerIndex = 0;

        List<Integer> innerList = new ArrayList<>();

        for (int i = 0; i <= input.size(); i++) {

            if (i >= input.size()) {
                innerIndex++;
                i = 0;

                System.out.println(innerList);
                relationshipMatrix.add(innerList);
                innerList.clear();
            } else if (innerIndex == input.size()) {
                break;
            }

            innerList.add(input.get(i).get(innerIndex));
        }

        return 0;

    }

    public static void main(String[] args) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> listA = Arrays.asList(1,1,0,0);
        List<Integer> listB = Arrays.asList(1,1,1,0);
        List<Integer> listC = Arrays.asList(0,1,1,0);
        List<Integer> listD = Arrays.asList(0,0,0,1);

        outerList.add(listA);
        outerList.add(listB);
        outerList.add(listC);
        outerList.add(listD);

        solution(outerList);
    }
}

