package com.company.questions.lines;
//refactor to X and Y coordinates
public class Point {
    private Integer xAxis;
    private Integer yAxis;

    public Point(Integer x_Axis, Integer y_Axis) {
        xAxis = x_Axis;
        yAxis = y_Axis;
    }

    public Integer getxAxis() {
        return xAxis;
    }

    public void setxAxis(Integer xAxis) {
        this.xAxis = xAxis;
    }

    public Integer getyAxis() {
        return yAxis;
    }

    public void setyAxis(Integer yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "(" + xAxis + ", " + yAxis + ")";
    }
}
