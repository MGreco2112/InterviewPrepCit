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
        Line output = null;
        int maxLength = 0;

        for (Line line : list_of_lines) {
            if (line.getPoints().size() > maxLength) {
                maxLength = line.getPoints().size();
                output = line;
            }
        }

        return output;
    }

    @Override
    public Vector<Line> getLinesStartingWithPoint(Point p) {
        Vector<Line> output = new Vector<>();

        for (Line line : list_of_lines) {
            if (Objects.equals(line.getPoints().get(0).getData(), p.getData())) {
                output.add(line);
            }
        }

        return output;
    }
}
