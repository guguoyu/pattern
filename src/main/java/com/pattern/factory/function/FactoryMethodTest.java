package com.pattern.factory.function;

import com.pattern.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse iCourse = pythonCourseFactory.create();
        iCourse.record();
    }
}
