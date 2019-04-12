package com.pattern.adapter;

/**
 * @author guguoyu
 * @date 2019/4/12
 * @since JDK 1.8
 */
public class SigninForThirdServiceTest {

    public static void main(String[] args) {

        SignForThirdService service = new SignForThirdService();
        service.loginForQQ("qweqwe");
    }

}
