package com.pattern.adapter;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId) {
        //调用原来的登录方法
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        //通过token拿到用户信息，再重新登录一次
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, password);
    }
}
