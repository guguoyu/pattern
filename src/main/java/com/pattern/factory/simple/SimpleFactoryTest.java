package com.pattern.factory.simple;

import com.pattern.factory.PythonCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.createCourse(PythonCourse.class).record();
    }
}
