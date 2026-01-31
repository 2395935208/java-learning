package com.libohan.ooplearn.ooptest4;

public class Test {
    public static void main(String[]args){
        //要求1：大一新生，张三，18岁，183出门，60kg，刚进大学努力学习
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setHeight(183);
        s1.setWeight(60);
        System.out.println(s1.getName()+","+s1.getAge()+","+s1.getHeight()+","+s1.getWeight());
        s1.study();
        //年龄加一
        s1.setAge(s1.getAge()+1);
        //要求2：大二期间体重增加了10kg
        double newWeigth=s1.getWeight()+10;
        s1.setWeight(newWeigth);
        System.out.println(s1.getName()+","+s1.getAge()+","+s1.getHeight()+","+s1.getWeight());
        //年龄加一
        s1.setAge(s1.getAge()+1);
        //要求3：身高增加2厘米，体重减少3kg
        s1.setHeight(s1.getHeight()+2);
        s1.setWeight(s1.getWeight()-3);
        System.out.println(s1.getName()+","+s1.getAge()+","+s1.getHeight()+","+s1.getWeight());
        //年龄加一
        s1.setAge(s1.getAge()+1);
        //大学毕业，年龄再加一
        s1.setAge(s1.getAge()+1);
        //要求4：大学毕业，打印所有信息
        System.out.println(s1.getName()+","+s1.getAge()+","+s1.getHeight()+","+s1.getWeight());
    }
}
