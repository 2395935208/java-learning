package com.libohan.staticTest;

public class Test {
    public static void main(String[]args){
        Student s1=new Student();
        Student s2=new Student();
        //静态变量是共享的
        //调用方式：推荐使用类名
        Student.teacherName="小文老师";
        s1.name="小丹丹";
        s1.age=19;
        s2.name="小诗诗";
        s2.age=20;
        //只要修改之后，其他对象都会改变
        Student.teacherName="啊伟老师";
        System.out.println(s1.name+" "+s1.age+" "+Student.teacherName);
        System.out.println(s2.name+" "+s2.age+" "+Student.teacherName);
    }
}
