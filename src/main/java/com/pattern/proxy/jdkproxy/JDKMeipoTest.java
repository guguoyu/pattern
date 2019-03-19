package com.pattern.proxy.jdkproxy;

import com.pattern.proxy.staticd.Object;
import com.pattern.proxy.staticd.Son;

public class JDKMeipoTest {
    public static void main(String[] args) {
        JDKMeiPo jdkMeiPo = new JDKMeiPo();
        Object proxy = (Object) jdkMeiPo.getInstance(new Son());
        proxy.findLove();


    }
}
