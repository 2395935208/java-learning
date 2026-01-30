package com.libohan.ooplearn.ooptest2;

public class Test {
    public static void main(String[]args){
        Teacher t=new Teacher();
        t.name="张三";
        t.age=18;
        System.out.println("姓名："+t.name+"，年龄："+t.age);
        t.teach();
        t.sleep();
        t.eat();
    }
}
