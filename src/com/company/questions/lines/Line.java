package com.company.questions.lines;

import java.util.List;
//research wat as Vector is and how to utilize it as a line in a coordinate plane
public class Line {
    private Point head;
    private Point end;

    public Line(Point head, Point end) {
        this.head = head;
        this.end = end;
    }

    public Point getHead() {
        return head;
    }

    public void setHead(Point head) {
        this.head = head;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return head + ", " + end;
    }
}
