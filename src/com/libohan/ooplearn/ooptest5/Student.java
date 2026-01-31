package com.libohan.ooplearn.ooptest5;

public class Student {
    //定义一个javabean类描述学生
    //属性：姓名，年龄，性别，身高
    private String name;
    private int age;
    private String sex;
    private double height;
    //构造方法
    public Student(){
        System.out.println("无构造");
    }
    public Student(String name,int age,String sex,double height){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.height=height;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
}
