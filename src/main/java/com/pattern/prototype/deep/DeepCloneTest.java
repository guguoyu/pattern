package com.pattern.prototype.deep;

public class DeepCloneTest {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆："+(clone.jInGuBang==qiTianDaSheng.jInGuBang));

            QiTianDaSheng shallowClone = (QiTianDaSheng) qiTianDaSheng.shallowClone(qiTianDaSheng);
            System.out.println("浅克隆："+(shallowClone.jInGuBang==qiTianDaSheng.jInGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
