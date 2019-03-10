package com.pattern.factory.abstrac;

public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("正在编辑java文档");
    }
}
