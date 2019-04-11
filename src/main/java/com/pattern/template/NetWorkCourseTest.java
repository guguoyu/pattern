package com.pattern.template;

public class NetWorkCourseTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("========");
        PythonCourse pythonCourse = new PythonCourse(true);
        pythonCourse.createCourse();
    }
}
