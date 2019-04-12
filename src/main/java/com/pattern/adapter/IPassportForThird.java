package com.pattern.adapter;

public interface IPassportForThird {
    /**
     * QQ登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 记住登录状态后自动登录
     *
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param tel
     * @param code
     * @return
     */
    ResultMsg loginForTel(String tel,String code);
}
