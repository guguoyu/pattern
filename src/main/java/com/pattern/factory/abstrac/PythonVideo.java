package com.pattern.factory.abstrac;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("正在录制python课程");
    }
}
