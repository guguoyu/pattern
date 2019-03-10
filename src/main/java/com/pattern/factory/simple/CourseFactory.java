package com.pattern.factory.simple;

import com.pattern.factory.ICourse;

public class CourseFactory {

    public ICourse createCourse(Class<? extends ICourse> clazz) {


        try {
            if(null!=clazz){
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
