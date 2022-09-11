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
        Line maxLine = null;
        double maxLength = 0L;

        for (Line line : list_of_lines) {
            double currentLength = Math.sqrt(
                    line.getHead().getxAxis() - line.getEnd().getxAxis() * 2
                    +
                    line.getHead().getyAxis() - line.getEnd().getyAxis() * 2
            );

            if (currentLength > maxLength) {
                maxLine = line;
                maxLength = currentLength;
            }
        }

        return maxLine;
    }

    @Override
    public Vector<Line> getLinesStartingWithPoint(Point p) {
        Vector<Line> output = new Vector<>();

        for (Line line : list_of_lines) {
            int x_axis = line.getHead().getxAxis();
            int y_axis = line.getHead().getyAxis();

            if (Objects.equals(x_axis, p.getxAxis()) && Objects.equals(y_axis, p.getyAxis())) {
                output.add(line);
            }
        }

        return output;
    }
}
