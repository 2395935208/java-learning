package com.libohan.ooplearn.ooptest3;

public class Test {
    public static void main(){
        dog d=new dog();
        d.setName("小白");
        System.out.println(d.getName());
        d.setAge(2);
        System.out.println(d.getAge());
        d.eat();
    }
}
