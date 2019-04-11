package com.pattern.adapter;

import com.pattern.template.jdbc.Member;

public class SignService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
