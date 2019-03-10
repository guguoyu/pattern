package com.pattern.factory.abstrac;

public class CourseTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createVideo().record();
        courseFactory.createNote().edit();

        CourseFactory pythonCourse = new PythonCourseFactory();
        pythonCourse.createNote().edit();
        pythonCourse.createVideo().record();
    }
}
