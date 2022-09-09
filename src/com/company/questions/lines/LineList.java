package com.company.questions.lines;

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
        return null;
    }

    @Override
    public Vector<Line> getLinesStartingWithPoint(Point p) {
        return null;
    }
}
