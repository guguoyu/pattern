package com.pattern.adapter;

/**
 * @author guguoyu
 * @date 2019/4/12
 * @since JDK 1.8
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
