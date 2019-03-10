package com.pattern.factory.function;

import com.pattern.factory.ICourse;
import com.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
