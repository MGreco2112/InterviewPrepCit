package com.company;

import com.company.questions.FizzBuzz;
import com.company.questions.LastAndSecondLast;
import com.company.questions.cars.Car;
import com.company.questions.cars.HondaCity;
import com.company.questions.cars.InnovaCrysta;
import com.company.questions.cars.WagonR;
import com.company.questions.lines.Line;
import com.company.questions.lines.LineList;
import com.company.questions.lines.Point;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//        System.out.println(LastAndSecondLast.solution("APPLE"));

//        Car wagonR = new WagonR("25");
//        Car hondaCity = new HondaCity("22");
//        Car innovaCrysta = new InnovaCrysta("15");
//
//        System.out.println(wagonR);
//        System.out.println(hondaCity);
//        System.out.println(innovaCrysta);
        Line lineOne = new Line(new Point(3,8), new Point(13, 14));
        Line lineTwo = new Line(new Point(8, 4), new Point(3, 12));
        Line lineThree = new Line(new Point(-7, -4), new Point(17, 6));
        Line lineFour = new Line(new Point(7, 3), new Point(1, 2));

        Point startingPoint = new Point(8, 4);

        Vector<Line> lines = new Vector<>();
        lines.add(lineOne);
        lines.add(lineTwo);
        lines.add(lineThree);
        lines.add(lineFour);
        LineList testList = new LineList(lines);

        Line longestLine = testList.getLineWithMaxLength();

        System.out.println("Longest Line ------> ("
                + longestLine.getHead().getxAxis() + " , " + longestLine.getHead().getyAxis()
                + ") , (" + longestLine.getEnd().getxAxis() + " , " + longestLine.getEnd().getyAxis() + ")"
        );
        System.out.println("Length: " + Math.sqrt(
                ((Math.abs(Math.pow(longestLine.getHead().getxAxis() - longestLine.getEnd().getxAxis(), 2))))
                        +
                        ((Math.abs(Math.pow(longestLine.getHead().getyAxis() - longestLine.getEnd().getyAxis(), 2))))
        ));
        System.out.println("All the lines starting from Point (" + startingPoint.getxAxis() + ", " + startingPoint.getyAxis() + ")");

        Vector<Line> linesOfPoint = testList.getLinesStartingWithPoint(startingPoint);

        for (Line line : linesOfPoint) {
            System.out.println(line);
        }
    }
}
