package com.pattern.singleton.enums;

import com.pattern.singleton.serializabled.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {
    public static void main(String[] args) {
        {
            EnumSingleton s1 = EnumSingleton.getInstance();
            s1.setData(new Object());
            try {
                FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
                ObjectOutputStream os = new ObjectOutputStream(fos);
                os.writeObject(s1);
                os.flush();
                os.close();

                FileInputStream fis = new FileInputStream("EnumSingleton.obj");
                ObjectInputStream ois = new ObjectInputStream(fis);
                EnumSingleton s2 = (EnumSingleton) ois.readObject();
                ois.close();

                System.out.println(s1.getData());
                System.out.println(s2.getData());
                System.out.println(s1.getData()==s2.getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
