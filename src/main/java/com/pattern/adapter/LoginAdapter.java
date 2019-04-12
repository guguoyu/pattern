package com.pattern.adapter;

/**
 * @author guguoyu
 * @date 2019/4/12
 * @since JDK 1.8
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);

}
