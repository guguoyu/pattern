package com.pattern.factory.abstrac;

public interface CourseFactory {

    public INote createNote();

    public IVideo createVideo();
}
