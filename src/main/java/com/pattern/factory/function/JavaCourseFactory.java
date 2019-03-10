package com.pattern.factory.function;

import com.pattern.factory.ICourse;
import com.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
