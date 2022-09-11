package com.company.questions.lines;

import java.util.Objects;
import java.util.Vector;

public class LineList implements LineListInterface{
    private Vector<Line> list_of_lines;

    public LineList(Vector<Line> list_of_lines) {
        this.list_of_lines = list_of_lines;
    }

    public Vector<Line> getList_of_lines() {
        return list_of_lines;
    }

    public void setList_of_lines(Vector<Line> list_of_lines) {
        this.list_of_lines = list_of_lines;
    }

    @Override
    public Line getLineWithMaxLength() {
        //TODO research how to determine length of line formula

        return null;
    }

    @Override
    public Vector<Line> getLinesStartingWithPoint(Point p) {
        Vector<Line> output = new Vector<>();

        for (Line line : list_of_lines) {
            int x_axis = line.getHead().getX_Axis();
            int y_axis = line.getHead().getY_Axis();

            if (Objects.equals(x_axis, p.getX_Axis()) && Objects.equals(y_axis, p.getY_Axis())) {
                output.add(line);
            }
        }

        return output;
    }
}
