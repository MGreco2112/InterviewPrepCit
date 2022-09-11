package com.company.questions.lines;
//refactor to X and Y coordinates
public class Point {
    private Integer X_Axis;
    private Integer Y_Axis;

    public Point(Integer x_Axis, Integer y_Axis) {
        X_Axis = x_Axis;
        Y_Axis = y_Axis;
    }

    public Integer getX_Axis() {
        return X_Axis;
    }

    public void setX_Axis(Integer x_Axis) {
        X_Axis = x_Axis;
    }

    public Integer getY_Axis() {
        return Y_Axis;
    }

    public void setY_Axis(Integer y_Axis) {
        Y_Axis = y_Axis;
    }
}
