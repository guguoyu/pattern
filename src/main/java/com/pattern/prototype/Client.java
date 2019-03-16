package com.pattern.prototype;

public class Client {
    private ProtoType protoType;

    public Client(ProtoType protoType){
        this.protoType=protoType;
    }

    public ProtoType startClone(ProtoType concretPrototype){
        ProtoType clone = concretPrototype.clone();
        return clone;
    }
}
