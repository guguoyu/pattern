package com.pattern.delegate.simple;

public class DelegateSimpleTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("登陆",new Leader());
    }
}
