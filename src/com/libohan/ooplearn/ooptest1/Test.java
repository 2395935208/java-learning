package com.libohan.ooplearn.ooptest1;

public class Test {
    static void main() {
        Student s1=new Student();
        s1.name="张三";
        s1.sex="男";
        s1.age=18;
        s1.height=1.80;
        System.out.println("姓名："+s1.name+"，性别："+s1.sex+"，年龄："+s1.age+"，身高："+s1.height);
    }
}
