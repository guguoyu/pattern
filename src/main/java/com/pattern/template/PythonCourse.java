package com.pattern.template;

public class PythonCourse extends NetworkCourse {

    private boolean flag = false;

    public PythonCourse(boolean flag) {
        this.flag=flag;
    }

    @Override
    protected boolean needHomeWork() {
        return flag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查python课程作业");
    }
}
