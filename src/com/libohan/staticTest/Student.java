package com.libohan.staticTest;

public class Student {
    //学生属性：姓名，年龄，老师
    //一个班中所有学生共享一个老师
    //学生1：小丹丹，19
    //学生2：小诗诗，20
    //最初是小文老师上课，有天小丹丹申请换老师，换成了阿伟老师
    String name;
    int age;
    static String teacherName;
}
