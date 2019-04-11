package com.pattern.template;

/**
 * 模板会有一个或者多个未实现的方法
 * 而且这几个未实现方法有固定的执行顺序
 */
public abstract class NetworkCourse {
    protected final void createCourse() {
        //1.发布预习资料
        this.postPreResource();
        //2.制作PPT课件
        this.createPPT();
        //3.在线直播
        this.liveVideo();
        //4.提交课件、课堂笔记
        this.postNote();
        //5.提交源码
        this.postSource();
        //6.布置作业，有些课没有作业，有些课有作业
        //有作业就检查，没作业，就不检查
        if(needHomeWork()){
            checkHomeWork();
        }

    }

    abstract void checkHomeWork();
    //钩子方法，实现流程的微调
    protected boolean needHomeWork() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源码");
    }

    final void postNote() {
        System.out.println("提交课件、课堂笔记");
    }

    final void liveVideo() {
        System.out.println("在线直播");
    }

    //制作PPT课件
    final void createPPT() {
        System.out.println("制作PPT");
    }

    //发布预习资料
    final void postPreResource() {
        System.out.println("发布预习资料");
    }


}
