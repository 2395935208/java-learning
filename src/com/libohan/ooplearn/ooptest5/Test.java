package com.libohan.ooplearn.ooptest5;

public class Test {
    public static void main(){
        Student s1=new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        System.out.println(s1.getHeight());
        Student s2=new Student("张三",18,"男",1.80);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());
        System.out.println(s2.getHeight());
    }
}
