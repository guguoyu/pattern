package com.pattern.adapter;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        return null;
    }
    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,password);
        return super.login(username,password);
    }
}
