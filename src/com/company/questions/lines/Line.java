package com.company.questions.lines;

import java.util.List;
//research wat as Vector is and how to utilize it as a line in a coordinate plane
public class Line {
    List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
