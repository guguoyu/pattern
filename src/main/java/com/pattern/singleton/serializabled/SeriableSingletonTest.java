package com.pattern.singleton.serializabled;

import java.io.*;

public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton s1 = SeriableSingleton.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(s1);
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SeriableSingleton s2 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
