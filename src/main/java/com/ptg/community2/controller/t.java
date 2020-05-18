package com.ptg.community2.controller;

public class t {
    public static void main(String[] args) {
        A a = new A();


        A b = a;
        a.setS("asdasdas");
        System.out.println( a);
        System.out.println( a.s);
        System.out.println( b);
        System.out.println( b.getS());

    }
}
class A{
 String s;

    public String getS() {
        return s;
    }

    public A setS(String s) {
        this.s = s;
        return this;
    }
}
