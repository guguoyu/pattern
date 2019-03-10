package com.pattern.factory.abstrac;

public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("正在编辑python文档");
    }
}
