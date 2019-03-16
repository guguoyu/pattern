package com.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JInGuBang jInGuBang;

    public QiTianDaSheng(){
        this.birthday=new Date();
        this.jInGuBang=new JInGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepclone();
    }

    private Object deepclone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy =(QiTianDaSheng) ois.readObject();
            copy.birthday=new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public Object shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height=target.height;
        qiTianDaSheng.weight=target.weight;
        qiTianDaSheng.jInGuBang= target.jInGuBang;
        qiTianDaSheng.birthday=new Date();
        return qiTianDaSheng;
    }
}
