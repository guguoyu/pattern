package com.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("zhangsan");
        concretePrototypeA.setAge(20);
        List hobbies = new ArrayList();
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA);
        //开始克隆
        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA protoType = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(protoType);

        System.out.println("克隆前的地址:"+concretePrototypeA.getHobbies());
        System.out.println("克隆后的地址:"+protoType.getHobbies());
        System.out.println(protoType.getHobbies()==concretePrototypeA.getHobbies());
    }
}
