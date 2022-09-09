package com.company.questions.lines;

import java.awt.*;
import java.util.Vector;

public interface LineListInterface {
    Vector<Line> list_of_lines = new Vector<>();

    Line getLineWithMaxLength();

    Vector<Line> getLinesStartingWithPoint(Point p);


}
