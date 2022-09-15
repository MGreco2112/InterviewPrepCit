package com.company.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LessonsMissed {
    public static int lessons(int numLessons, int firstDayOut, int lastDayOut) {
        Set<Integer> uniqueLessons = new HashSet<>();
        List<Integer> lessonList = new ArrayList<>();

        //each day a lesson is covered starting on day 0 with lesson zero
        //daily lesson is currentDay % numLessons
        //find out how many unique lessons are missed during that length of time

        int totalDaysMissed = lastDayOut - firstDayOut;
        int currentLesson = firstDayOut % numLessons;

        for (int day = 0; day <= totalDaysMissed; day++) {
            if (uniqueLessons.contains(currentLesson)) {
                return uniqueLessons.size();
            }

            uniqueLessons.add(currentLesson);
            lessonList.add(currentLesson);

            currentLesson++;

            if (currentLesson >= numLessons) {
                currentLesson = 0;
            }
        }

        System.out.println(lessonList);
        return uniqueLessons.size();
    }

    public static void main(String[] args) {
        System.out.println(lessons(2, 10, 12));
    }

    //solution located online, will research
    //public static int missedLectures(int numChapters,int b,int e)
    //	{
    //		return Math.min(e-b+1,numChapters);
    //	}
    //	public static void main(String[] args)
    //	{
    //		System.out.println(missedLectures(5,5,6));//2
    //		System.out.println(missedLectures(4,3,5));//3
    //
    //	}
}
